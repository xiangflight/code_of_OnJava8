package chapter19;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/13
 */

public class TypeCounter extends HashMap<Class<?>, Integer> {

    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object object) {
        Class<?> type = object.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(object + " incorrect type: " + type + ", should be type or subtype of " + baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null? 1: quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass)) {
            countClass(superClass);
        }
    }

    @Override
    public String toString() {
        String result = entrySet().stream().map(pair -> String.format("%s=%s", pair.getKey().getSimpleName(), pair.getValue())).collect(Collectors.joining(", "));
        return "{" + result + "}";
    }
}

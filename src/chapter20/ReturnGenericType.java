package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/23
 */

public class ReturnGenericType<T extends HasF> {

    private T obj;

    ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }

}

package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-19 13:59
 */

public class CurringDemo {


    public static IntFunction<Integer> curring(Function<List<Integer>, Integer> fn) {
        List<Integer> result = new ArrayList<>();
        return arg -> {
            if (arg != Integer.MAX_VALUE) {
                result.add(arg);
            } else {
                return fn.apply(result);
            }
            return null;
        };
    }

    public static void main(String[] args) {
        IntFunction<Integer> currPrice = curring(items ->
                Long.valueOf(items.stream().mapToLong(i -> Long.valueOf(i)).sum()).intValue());
        currPrice.apply(1);
        currPrice.apply(2);
        currPrice.apply(3);
        currPrice.apply(4);
        int result = currPrice.apply(Integer.MAX_VALUE);
        System.out.println(result);
    }


}

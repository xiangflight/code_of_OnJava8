package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 17:02
 */

public class UseJavaFunctions {

    public static void main(String[] args) {
        forEach(
                Arrays.asList(1, 2, 3, 4, 5),
                (Integer i) -> System.out.print(i + " ")
        );

        System.out.println();

        List<Integer> l = map(
                Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length()
        );
        System.out.println(l);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p ) {
        List<T> results = new ArrayList<>();
        for (T e: list) {
            if (p.test(e)) {
                results.add(e);
            }
        }
        return results;
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T i: list) {
            consumer.accept(i);
        }
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T s: list) {
            result.add(f.apply(s));
        }
        return result;
    }


}

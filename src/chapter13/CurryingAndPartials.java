package chapter13;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-19 12:59
 */

public class CurryingAndPartials {

    private static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum  = a -> b -> a + b;
        System.out.println(uncurried("Hi", "Ho"));
        Function<String, String> hi = sum.apply("Hi");
        System.out.println(hi.apply("Ho"));

        Function<Integer, Function<Integer, Function<Integer, Integer>>> curring = x -> y -> z -> (x + y) * z;
        System.out.println(curring.apply(4).apply(5).apply(6));

        IntFunction<IntFunction<IntUnaryOperator>> f = x -> y -> z -> (x + y) * z;
        System.out.println(f.apply(4).apply(5).applyAsInt(6));
    }

}

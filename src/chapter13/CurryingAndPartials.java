package chapter13;

import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-19 12:59
 */

public class CurryingAndPartials {

    private static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        System.out.println(uncurried("Hi ", "Ho"));
        Function<String, String> hi = sum.apply("Hi ");
        System.out.println(hi.apply("Ho"));

        // Partial application
        Function<String, String> sumHi = sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));
    }

}

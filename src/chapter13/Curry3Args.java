package chapter13;

import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-19 18:24
 */

public class Curry3Args {

    public static void main(String[] args) {
        Function<String, Function<String, Function<String, String>>> sum = a -> b -> c -> a + b + c;
        Function<String, Function<String, String>> hi = sum.apply("Hi ");
        Function<String, String> ho = hi.apply("Ho ");
        System.out.println(ho.apply("Hup"));
    }

}

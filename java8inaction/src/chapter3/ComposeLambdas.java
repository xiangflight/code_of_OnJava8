package chapter3;

import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 09:57
 */

public class ComposeLambdas {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.compose(g);
        final Integer result = h.apply(1);
        System.out.println(result);
    }
}

package chapter13;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-19 20:45
 */

public class CurriedIntAdd {

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
}
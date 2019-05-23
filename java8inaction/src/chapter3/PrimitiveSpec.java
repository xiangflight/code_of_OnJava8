package chapter3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 17:23
 */

public class PrimitiveSpec {

    public static void main(String[] args) {

        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
        System.out.println(oddNumbers.test(1000));

    }

}

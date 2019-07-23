package chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-22 17:57
 */

public class RecursiveFactorial {

    static IntCall fact;

    public static void main(String[] args) {
        fact = n -> n == 0? 1: n * fact.call(n - 1);
        for (int i = 0; i <= 10; i++) {
            System.out.println(fact.call(i));
        }
    }

}

package chapter16;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/29
 */

public class BadMicroBenchmark {

    static final int SIZE = 250_000_000;

    public static void main(String[] args) {
        try {
            long[] la = new long[SIZE];
            System.out.println("setAll: " + Timer.duration(() -> Arrays.setAll(la, n -> n)));
            System.out.println("parallelSetAll: " + Timer.duration(() -> Arrays.parallelSetAll(la, n -> n)));
        } catch (OutOfMemoryError e) {
            System.out.println("Insufficient memory");
            System.exit(0);
        }
    }

}

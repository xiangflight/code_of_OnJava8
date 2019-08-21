package chapter14;

import java.util.stream.IntStream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-21 22:54
 */

public class Ranges {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 10; i < 20; i++) {
            result += i;
        }
        System.out.println(result);
        // for-in with a range:
        result = 0;
        for (int i: IntStream.range(10, 20).toArray()) {
            result += i;
        }
        System.out.println(result);
        // Use streams:
        System.out.println(IntStream.range(10, 20).sum());
    }
}

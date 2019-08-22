package chapter14;

import java.util.function.IntConsumer;

import static java.util.stream.IntStream.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-22 09:18
 */

public class Repeat {

    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(value -> action.run());
    }

}

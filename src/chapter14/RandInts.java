package chapter14;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/17 9:25 上午
 */

public class RandInts {

    private static int[] rints = new Random(47).ints(0, 1000).limit(100).toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }

}

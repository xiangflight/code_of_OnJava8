package chapter14;

import static chapter14.RandInts.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/17 9:37 上午
 */

public class ForEach {

    static final int SZ = 14;

    public static void main(String[] args) {
        rands().limit(SZ)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .forEachOrdered(n -> System.out.format("%d ", n));
    }

}

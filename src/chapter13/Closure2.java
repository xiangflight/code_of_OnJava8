package chapter13;

import java.util.function.IntSupplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-15 09:13
 */

public class Closure2 {

    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }

}

package chapter13;

import java.util.function.IntSupplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-15 09:28
 */

public class Closure7 {

    IntSupplier makeFun(int x) {
        Integer i = 0;
//        i = i + 1;
        return () -> x + i;
    }

}

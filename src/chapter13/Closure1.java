package chapter13;

import java.util.function.IntSupplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-06 13:58
 */

public class Closure1 {

    int i;

    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}

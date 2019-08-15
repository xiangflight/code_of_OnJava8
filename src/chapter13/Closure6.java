package chapter13;

import java.util.function.IntSupplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-15 09:24
 */

public class Closure6 {

    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;
        int iFinal = i;
        int xFinal = x;
        return () -> iFinal + xFinal;
    }

}

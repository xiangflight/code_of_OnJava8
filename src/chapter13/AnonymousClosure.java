package chapter13;

import java.util.function.IntSupplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-16 09:06
 */

public class AnonymousClosure {

    IntSupplier makeFun(int x) {
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }

}

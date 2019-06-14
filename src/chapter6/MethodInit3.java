package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-14 08:56
 */

public class MethodInit3 {
    //- int j = g(i); // Illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}

package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-14 08:55
 */

public class MethodInit2 {

    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}

package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */

public class SelfBoundingMethods {

    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

}

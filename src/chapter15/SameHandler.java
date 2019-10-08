package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 7:02 下午
 */
class EBase1 extends Exception {}
class Except1 extends EBase1 {}
class EBase2 extends Exception {}
class Except2 extends EBase2 {}
class EBase3 extends Exception {}
class Except3 extends EBase3 {}
class EBase4 extends Exception {}
class Except4 extends EBase4 {}

public class SameHandler {

    void x() throws Except1, Except2, Except3, Except4 {}

    void process() {}

    void f() {
        try {
            x();
        } catch (Except1 | Except2 | Except3 | Except4 e) {
            process();
        }
    }

}

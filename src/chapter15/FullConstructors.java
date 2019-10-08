package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 9:38 上午
 */
class MyException extends Exception {

    MyException() {}

    MyException(String msg) {
        super(msg);
    }

}

public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated from g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }

}

package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 7:08 下午
 */

public class WhoCalled {

    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste: e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("******");
        g();
        System.out.println("******");
        h();
    }

}

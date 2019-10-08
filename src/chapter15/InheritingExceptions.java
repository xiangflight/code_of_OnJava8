package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 9:31 上午
 */
class SimpleException extends Exception {}

public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }

}

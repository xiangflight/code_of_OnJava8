package chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-16 13:04
 */
abstract class Base {

    Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    public abstract void f();
}
public class AnonymousConstructor {

    public AnonymousConstructor() {
    }

    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

}

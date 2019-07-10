package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-09 16:13
 */

public class Implementation2 implements InterfaceWithDefault {

    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}

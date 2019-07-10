package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-09 16:08
 */

public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }
}

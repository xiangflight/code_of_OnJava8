package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/23
 */

public class Manipulator2<T extends HasF> {

    private T obj;

    Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }

}

package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/23
 */
class Manipulator<T> {

    private T obj;

    Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
//        obj.f();
    }

}

public class Manipulation {

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
    }

}

package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-09 15:36
 */
interface Concept {
    void idea1();
    void idea2();
}

class Implementation implements Concept {

    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}

public class ImplementingAnInterface {
    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.idea1();
    }
}

package chapter19;

import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/12
 */
class Initable {
    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.STATIC_FINAL);
        System.out.println(Initable.STATIC_FINAL2);
        System.out.println("----------------------");
        System.out.println(Initable2.staticNonFinal);
        System.out.println("----------------------");
        Class initable3 = Class.forName("chapter19.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }

}

package chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-23 09:42
 */
@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

@FunctionalInterface
interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {

    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        Functional f1 = a -> "Goodbye, " + a;
        FunctionalNoAnn fna1 = a -> "Goodbye, " + a;
    }

}

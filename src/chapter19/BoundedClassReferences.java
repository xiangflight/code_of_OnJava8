package chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/12
 */

public class BoundedClassReferences {

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}

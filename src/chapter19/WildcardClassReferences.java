package chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/12
 */

public class WildcardClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }

}

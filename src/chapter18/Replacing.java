package chapter18;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/10
 */

public class Replacing {

    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }

}

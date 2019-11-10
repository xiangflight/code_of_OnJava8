package chapter18;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/10
 */

public class IntegerMatch {

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }

}

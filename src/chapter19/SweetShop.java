package chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/11
 */

public class SweetShop {

    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("chapter19.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }

}

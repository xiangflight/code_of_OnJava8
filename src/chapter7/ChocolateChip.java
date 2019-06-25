package chapter7;

import chapter7.dessert.Cookie;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-22 15:42
 */

public class ChocolateChip extends Cookie {

    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //- bite(); // Can't access bite
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}

package chapter14;

import static chapter14.Repeat.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-22 09:20
 */

public class Looping {

    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }

}

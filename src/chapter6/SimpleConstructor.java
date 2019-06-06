package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-05 13:16
 */

public class SimpleConstructor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }

}

class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

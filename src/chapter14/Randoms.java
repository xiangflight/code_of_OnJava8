package chapter14;

import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-20 18:24
 */

public class Randoms {

    public static void main(String[] args) {
        new Random(47).ints(5, 20)
                .distinct().limit(7)
                .sorted().forEach(System.out::println);
    }
}

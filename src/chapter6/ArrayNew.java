package chapter6;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-15 13:56
 */

public class ArrayNew {

    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }

}

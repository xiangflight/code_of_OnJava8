package chapter6;

import java.util.Arrays;
import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-15 14:21
 */

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(a));
    }
}

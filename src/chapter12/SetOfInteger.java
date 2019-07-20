package chapter12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:38
 */

public class SetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }

}

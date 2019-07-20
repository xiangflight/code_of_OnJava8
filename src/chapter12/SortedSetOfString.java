package chapter12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:50
 */

public class SortedSetOfString {

    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Purple");
        }
        System.out.println(colors);
    }
}

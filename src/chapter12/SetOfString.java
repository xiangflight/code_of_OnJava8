package chapter12;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:48
 */

public class SetOfString {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
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

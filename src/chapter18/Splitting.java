package chapter18;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/10
 */

public class Splitting {

    public static final String knights = "Then, when you have found the shrubbery, " + "you must cut down the mightest tree in the " + "forest...with...a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }

}

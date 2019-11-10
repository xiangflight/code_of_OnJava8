package chapter18;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/10
 */

public class SplitDemo {

    public static void main(String[] args) {
        String input = "This!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }

}

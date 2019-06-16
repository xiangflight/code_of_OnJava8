package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-16 16:53
 */

public class DynamicArray {

    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }

}

class Other {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
    }
}

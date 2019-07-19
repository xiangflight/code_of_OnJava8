package chapter12;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-18 13:55
 */

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}

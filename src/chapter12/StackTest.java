package chapter12;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:27
 */

public class StackTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for (String s: "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (! stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}

package chapter18;

import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */

public class InfiniteRecursion {

    @Override
    public String toString() {
        return "InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}

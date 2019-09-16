package chapter14;

import java.util.Optional;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/16 9:23 上午
 */

public class StreamOfOptionals {

    public static void main(String[] args) {
        Signal.stream()
                .limit(10)
                .forEach(System.out::println);
        System.out.println(" ---");
        Signal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }

}

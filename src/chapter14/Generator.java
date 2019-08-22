package chapter14;

import com.sun.tools.javah.Gen;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-22 09:24
 */

public class Generator implements Supplier<String> {

    Random rand = new Random(47);

    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new Generator()).limit(30).collect(Collectors.joining());
        System.out.println(word);
    }
}

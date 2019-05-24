package chapter5;

import chapter4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 11:32
 */

public class Mapping {

    public static void main(String[] args) {
        // map
        List<Integer> dishNames =
                Dish.MENU.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        dishNames.forEach(System.out::println);

        // map length of word
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(wordLengths);

        final List<String> charList = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(charList);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> squareNumber = numbers.stream()
                .map(d -> d * d)
                .collect(Collectors.toList());
        System.out.println(squareNumber);

        words = Arrays.asList("Hello", "World");
        words.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = Arrays.asList(6, 7, 8);
        List<int[]> pairs = numbers1.stream()
                .flatMap((Integer i) -> numbers2.stream()
                        .map((Integer j) -> new int[]{i, j})
                )
                .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                .collect(Collectors.toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }

}

package chapter5;

import chapter4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 12:20
 */

public class Reducing {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a * b);
        sum.ifPresent(System.out::println);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        max.ifPresent(System.out::println);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int n = Dish.MENU.stream()
                .map(d -> 1)
                .reduce(0, Integer::sum);
        System.out.println(n);

        long m = Dish.MENU.parallelStream().count();
        System.out.println(m);

        long calories = Dish.MENU.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println(calories);
    }
}

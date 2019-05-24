package chapter5;

import chapter4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 11:19
 */

public class Filtering {

    public static void main(String[] args) {

        // Filtering with predicate
        List<Dish> vegetarianDishes =
                Dish.MENU.stream()
                        .filter(Dish::isVegetarian)
                        .collect(Collectors.toList());
        vegetarianDishes.forEach(System.out::println);

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
                Dish.MENU.stream()
                        .filter(d -> d.getCalories() > 300)
                        .limit(3)
                        .collect(Collectors.toList());
        dishesLimit3.forEach(System.out::println);

        // Skipping elements
        List<Dish> dishesSkip =
                Dish.MENU.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(Collectors.toList());
        dishesSkip.forEach(System.out::println);

        // Filtering MEAT
        List<Dish> dishesMeat =
                Dish.MENU.stream()
                        .filter(d -> Objects.equals(d.getType(), Dish.Type.MEAT))
                        .limit(2)
                        .collect(Collectors.toList());
        dishesMeat.forEach(System.out::println);
    }

}

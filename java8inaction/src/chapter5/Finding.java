package chapter5;

import chapter4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 12:03
 */

public class Finding {

    public static void main(String[] args) {
        if (isVegetarianFriendlyMenu()) {
            System.out.println("Vegetarian friendly");
        }

        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> dish = findVegetarianDish();
        dish.ifPresent(d -> System.out.println(d.getName()));

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst();
        firstSquareDivisibleByThree.ifPresent(System.out::println);
    }

    private static boolean isHealthyMenu2() {
        return Dish.MENU.stream().noneMatch(d -> d.getCalories() >= 1000);
    }

    private static boolean isHealthyMenu() {
        return Dish.MENU.stream().allMatch(d -> d.getCalories() < 1000);
    }

    private static boolean isVegetarianFriendlyMenu() {
        return Dish.MENU.stream().anyMatch(Dish::isVegetarian);
    }

    private static Optional<Dish> findVegetarianDish() {
        return Dish.MENU.stream().filter(Dish::isVegetarian).findAny();
    }

}

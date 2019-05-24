package chapter4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 10:20
 */

public class StreamBasic {

    public static void main(String[] args) {
        // Java 7
        getLowCaloricDishesNamesInJava7(Dish.MENU).forEach(System.out::println);

        System.out.println("----");

        getLowCaloricDishesNamesInJava8(Dish.MENU).forEach(System.out::println);
    }

    private static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        return dishes.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }

    private static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }

}

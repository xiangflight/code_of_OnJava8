package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 10:20
 */

public class StreamVsCollection {

    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames =
                Dish.MENU.stream()
                        .filter(d -> d.getCalories() > 300)
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(threeHighCaloricDishNames);

        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
    }
}

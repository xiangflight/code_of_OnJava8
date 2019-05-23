package chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 10:48
 */

public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
        System.out.println(greenApples);

        List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> Objects.equals("green", a.getColor()));
        System.out.println(greenApples2);

        List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        List<Apple> weiredApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || Objects.equals("brown", a.getColor()));
        System.out.println(weiredApples);

        List<Apple> heavyApples3 = inventory.stream().filter((Apple a) -> a.getWeight() > 150).collect(toList());
        System.out.println(heavyApples3);

        List<Apple> heavyApples4 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150).collect(toList());
        System.out.println(heavyApples4);
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Objects.equals("green", apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    private static boolean isGreenApple(Apple apple) {
        return Objects.equals("green", apple.getColor());
    }

    private static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private int weight;
        private String color;

        Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        String getColor() {
            return color;
        }

        int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}

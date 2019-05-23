package chapter3;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 16:21
 */

public class Lambdas {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello!");
        r.run();

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        List<Apple> greenApples = filter(inventory, (Apple a) -> Objects.equals("green", a.getColor()));
        System.out.println(greenApples);

        Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
        inventory.sort(c);
        System.out.println(inventory);

    }

    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
        private Integer weight;
        private String color;

        Apple(Integer weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        Integer getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    interface ApplePredicate {
        boolean test(Apple a);
    }
}

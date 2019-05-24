package chapter3;

import java.util.*;
import java.util.function.BiFunction;

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

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort(String::compareToIgnoreCase);
        System.out.println(str);

        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<String> colors = Arrays.asList("green", "red", "white", "black");
        List<Apple> apples = map(weights, colors, Apple::new);
        System.out.println(apples);
    }

    public static List<Apple> map(List<Integer> weights, List<String> colors, BiFunction<Integer, String, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (int i = 0; i < weights.size(); i++) {
            Integer weight = weights.get(i);
            String color = colors.get(i);
            result.add(f.apply(weight, color));
        }
        return result;
    }

    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    interface ApplePredicate {
        boolean test(Apple a);
    }

    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static class Apple {
        private Integer weight;
        private String color;

        Apple(Integer weight) {
            this.weight = weight;
        }

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
}

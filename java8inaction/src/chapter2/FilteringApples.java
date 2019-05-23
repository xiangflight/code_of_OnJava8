package chapter2;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 12:04
 */

public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(100, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        List<Apple> greenApples = filterApplesByColor(inventory, "green");
        System.out.println(greenApples);

        List<Apple> redApples = filterApplesByColor(inventory, "red");
        System.out.println(redApples);

        List<Apple> greenApples2 = filterApples(inventory, new AppleColorPredicate());
        System.out.println(greenApples2);

        List<Apple> heavyApples = filterApples(inventory, new AppleWeightPredicate());
        System.out.println(heavyApples);

        List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
        System.out.println(redAndHeavyApples);

        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

        List<Apple> redApples2 = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return Objects.equals("red", apple.getColor());
            }
        });
        System.out.println(redApples2);

        List<Apple> redApples3 = filterApples(inventory, (Apple apple) -> Objects.equals("red", apple.getColor()));
        System.out.println(redApples3);

        List<Apple> redApples4 = filter(inventory, (Apple apple) -> Objects.equals("red", apple.getColor()));
        System.out.println(redApples4);

        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5);
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
        System.out.println(evenNumbers);

        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };
        inventory.sort(byWeight);
        System.out.println(inventory);

        Comparator<Apple> byWeight2 = (Apple apple1, Apple apple2) -> apple2.getWeight().compareTo(apple1.getWeight());
        inventory.sort(byWeight);
        System.out.println(inventory);
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

    private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Objects.equals(color, apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public interface AppleFormatter {
        /**
         * 对苹果的参数格式化
         *
         * @param apple apple
         * @return 格式化后的字符串
         */
        String accept(Apple apple);
    }

    static class AppleFancyFormatter implements AppleFormatter {

        @Override
        public String accept(Apple apple) {
            String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
            return "A " + characteristic + " " + apple.getColor() + " apple";
        }
    }

    static class AppleSimpleFormatter implements AppleFormatter {

        @Override
        public String accept(Apple apple) {
            return "An apple of " + apple.getWeight() + "g";
        }
    }

    public static class Apple {
        private Integer weight;
        private String color;

        Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        Integer getWeight() {
            return weight;
        }

        String getColor() {
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

    public interface ApplePredicate {
        /**
         * selection criteria
         *
         * @param apple apple
         * @return true or false
         */
        boolean test(Apple apple);
    }

    static class AppleWeightPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    static class AppleColorPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return Objects.equals("green", apple.getColor());
        }
    }

    static class AppleRedAndHeavyPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return Objects.equals("red", apple.getColor())
                    && apple.getWeight() > 150;
        }
    }

    public interface Predicate<T> {
        /**
         * for all problem domain
         *
         * @param t type
         * @return true or false
         */
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

}

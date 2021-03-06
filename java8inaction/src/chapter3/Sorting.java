package chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 15:10
 */

public class Sorting {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        inventory.sort(new AppleComparator());
        System.out.println(inventory);

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        System.out.println(inventory);

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);

        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());
        inventory.sort(c);
        System.out.println(inventory);

        inventory.sort(comparing((a) -> a.getWeight()));
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(inventory);
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

    static class AppleComparator implements Comparator<Apple> {

        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }

}

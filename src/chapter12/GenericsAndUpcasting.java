package chapter12;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-18 13:02
 */
class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples= new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple apple: apples) {
            System.out.println(apple);
        }
    }
}

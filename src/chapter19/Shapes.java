package chapter19;

import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/11
 */

public class Shapes {

    public static void main(String[] args) {
        Stream.of(new Circle(), new Square(), new Triangle()).forEach(Shape::draw);
    }

}

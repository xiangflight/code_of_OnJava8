package chapter20;

import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/18
 */

public class BasicSupplierDemo {

    public static void main(String[] args) {
        Stream.generate(BasicSupplier.create(CountedObject.class)).limit(5).forEach(System.out::println);
    }

}

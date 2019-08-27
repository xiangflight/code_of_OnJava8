package chapter14;

import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-27 19:25
 */
class Numbered {
    final int n;

    Numbered(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered(" + n + ")";
    }
}

public class FunctionMap2 {

    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13).map(Numbered::new).forEach(System.out::println);
    }

}

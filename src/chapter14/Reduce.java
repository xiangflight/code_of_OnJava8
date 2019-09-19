package chapter14;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/19 9:01 上午
 */
class Frobnitz {
    static final int BOUND = 100;
    static Random rand = new Random(47);
    int size;

    Frobnitz(int sz) {
        size = sz;
    }

    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }

    @Override
    public String toString() {
        return "Frobnitz(" + size + ")";
    }
}

public class Reduce {

    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
                .ifPresent(System.out::println);
    }

}

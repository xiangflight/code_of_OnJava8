package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 */

public class RandomList<T> extends ArrayList<T> {

    private Random random = new Random(47);

    public T select() {
        return get(random.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        rs.addAll(Arrays.asList(("The quick brown fox jumped over " + "the lazy brown dog").split(" ")));
        IntStream.range(0, 11).forEach(i -> System.out.print(rs.select() + " "));
    }

}

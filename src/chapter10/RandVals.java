package chapter10;

import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-13 20:10
 */

public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}

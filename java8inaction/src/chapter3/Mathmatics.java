package chapter3;

import java.util.function.DoubleFunction;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 10:15
 */

public class Mathmatics {

    public double integrate(DoubleFunction<Double> f, double a, double b) {
        return (f.apply(a) + f.apply(b)) * (b - a) / 2.0;
    }

}

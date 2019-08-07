package chapter13;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-06 09:17
 */

public class FunctionWithWrapped {

    public static void main(String[] args) {
        Function<Integer, Double> fid = i -> (double)i;
        IntToDoubleFunction fid2 = i -> i;

    }

}

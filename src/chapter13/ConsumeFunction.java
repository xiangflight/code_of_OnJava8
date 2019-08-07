package chapter13;

import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-06 09:31
 */
class One {}
class Two {}

public class ConsumeFunction {
    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}

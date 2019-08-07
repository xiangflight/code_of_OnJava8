package chapter13;

import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-06 09:27
 */
interface FuncSS extends Function<String, String> {}

public class ProduceFunction {

    static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }
}

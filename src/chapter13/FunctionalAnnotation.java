package chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-23 09:42
 */
@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

@FunctionalInterface
interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {
}

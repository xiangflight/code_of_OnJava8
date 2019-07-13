package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-12 08:45
 */

public interface Processor {

    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}

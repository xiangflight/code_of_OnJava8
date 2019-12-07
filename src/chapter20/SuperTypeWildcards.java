package chapter20;

import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/5
 */

public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
    }

}

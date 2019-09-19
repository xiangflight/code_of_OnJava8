package chapter14;

import static chapter14.RandInts.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/19 9:32 上午
 */

public class SelectElement {

    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(rands().parallel().findAny().getAsInt());
    }

}

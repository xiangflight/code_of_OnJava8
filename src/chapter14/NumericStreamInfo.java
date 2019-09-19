package chapter14;

import static chapter14.RandInts.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/19 9:43 上午
 */

public class NumericStreamInfo {

    public static void main(String[] args) {
        System.out.println(rands().average().getAsDouble());
        System.out.println(rands().max().getAsInt());
        System.out.println(rands().min().getAsInt());
        System.out.println(rands().sum());
        System.out.println(rands().summaryStatistics());
    }

}

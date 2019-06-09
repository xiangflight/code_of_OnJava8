package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-09 14:17
 */

public class Apple {

    Apple getPeeled() {
        return Peeler.peel(this);
    }

}

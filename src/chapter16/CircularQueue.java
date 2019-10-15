package chapter16;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 8:11 下午
 */

public class CircularQueue {

    private Object[] data;

    private int in = 0, out = 0;

    private boolean wrapped = false;

    public CircularQueue(int size) {
        data = new Object[size];
    }

}

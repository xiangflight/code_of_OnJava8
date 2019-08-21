package chapter14;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-21 09:11
 */

public class Bubble {

    public final int i;

    public Bubble(int n) {
        this.i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ')';
    }

    private static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}

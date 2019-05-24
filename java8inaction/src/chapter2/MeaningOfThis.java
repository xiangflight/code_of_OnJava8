package chapter2;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 14:21
 */

public class MeaningOfThis {

    public final int value = 4;

    /**
     * answer is 5
     *
     * @param args args
     */
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }

    public void doIt() {
        int value = 6;

        Runnable r = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

}

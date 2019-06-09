package chapter6;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-09 14:09
 */

public class Leaf {

    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }

}

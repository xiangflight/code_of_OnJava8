package chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/11
 */

public abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public abstract String toString();
}

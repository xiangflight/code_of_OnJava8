package chapter20;

import java.util.function.Supplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/25
 */
class IntegerFactory implements Supplier<Integer> {

    private int i = 0;

    @Override
    public Integer get() {
        return ++i;
    }
}

class Widget {
    private int id;

    Widget(int n) {
        id = n;
    }

    @Override
    public String toString() {
        return "Widget " + id;
    }

    public static class Factory implements Supplier<Widget> {
        private int i = 0;

        @Override
        public Widget get() {
            return new Widget(++i);
        }
    }
}

class Fudge {
    private static int count = 1;

    private int n = count++;

    @Override
    public String toString() {
        return "Fudge " + n;
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {

    }
}

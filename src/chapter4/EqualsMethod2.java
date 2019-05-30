package chapter4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-30 09:54
 */

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int i;
}

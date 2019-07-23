package chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-23 09:20
 */
class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {

    public static void main(String[] args) {
//        MakeString ms = X::f;
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }

}

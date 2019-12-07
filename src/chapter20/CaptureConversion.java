package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */

public class CaptureConversion {

    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<>(1);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.set(new Object());
        f2(rawBasic);
        Holder<?> wildcarded = new Holder<>(1.0);
        f2(wildcarded);
    }

}

package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 */

public class GenericHolder<T> {

    private T a;

    public GenericHolder() {
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> h3 = new GenericHolder<>();
        h3.set(new Automobile());
        Automobile a = h3.get();
//        h3.set("asdfadsf");
    }
}

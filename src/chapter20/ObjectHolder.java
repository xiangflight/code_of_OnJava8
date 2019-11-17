package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/17
 */

public class ObjectHolder {

    private Object a;

    public ObjectHolder(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        ObjectHolder h2 = new ObjectHolder(new Automobile());
        Automobile a = (Automobile) h2.get();
        System.out.println(a);
        h2.set("Not an Automobile");
        String s = (String) h2.get();
        System.out.println(s);
        h2.set(1);
        Integer x = (Integer) h2.get();
        System.out.println(x);
    }
}

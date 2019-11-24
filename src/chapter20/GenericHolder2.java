package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 */

public class GenericHolder2<T> {

    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String[] args) {
        GenericHolder2<String> holder =  new GenericHolder2<>();
        holder.set("Item");
        String s = holder.get();
    }
}

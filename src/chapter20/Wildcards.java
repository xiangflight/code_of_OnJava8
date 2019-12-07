package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/6
 */

public class Wildcards {

    static void rawArgs(Holder holder, Object arg) {
        holder.set(arg);
        Object o = holder.get();
    }

    static void unbounedArgs(Holder<?> holder, Object arg) {
        Object o = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        return holder.get();
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        return holder.get();
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
        return holder.get();
    }

    static <T> T wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        return null;
    }
}

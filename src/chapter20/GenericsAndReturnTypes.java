package chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */
interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> { }

public class GenericsAndReturnTypes {

    void test(Getter g) {
        Getter getter = g.get();
        GenericGetter gg = g.get();
    }

}

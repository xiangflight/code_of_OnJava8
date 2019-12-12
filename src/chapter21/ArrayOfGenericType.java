package chapter21;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/11
 */

public class ArrayOfGenericType<T> {

    T[] array;

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        array = (T[]) new Object[size];
    }

//    public <U> U[] makeArray() {
//        return new U[10];
//    }

}

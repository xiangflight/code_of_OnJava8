package chapter12;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:29
 */

public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();

    public void push(T v) {
        storage.push(v);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.pop();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}

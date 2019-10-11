package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/11 8:55 上午
 */
class Reporter implements AutoCloseable {

    String name = getClass().getSimpleName();

    Reporter() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}

class First extends Reporter {}

class Second extends Reporter {}

public class AutoCloseableDetails {

    public static void main(String[] args) {
        try (First first = new First(); Second second = new Second();) {

        }
    }

}

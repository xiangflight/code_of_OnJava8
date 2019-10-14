package chapter16;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 6:54 下午
 */

public class LoaderAssertions {

    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        new Loaded().go();
    }

}

class Loaded {
    public void go() {
        assert false: "Loaded.go()";
    }
}

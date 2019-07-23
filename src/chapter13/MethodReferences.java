package chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-22 19:26
 */
interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences {

    static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");

        c = MethodReferences::hello;
        c.call("Bob");

        c = new Description("valuable")::help;
        c.call("information");

        c = Helper::assist;
        c.call("Help!");
    }

    static class Description {
        String about;

        Description(String desc) {
            about = desc;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

}

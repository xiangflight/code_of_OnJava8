package chapter8;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-06-24 18:59
 */

public class Cartoon extends Drawing {

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

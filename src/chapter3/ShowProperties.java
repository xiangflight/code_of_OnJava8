package chapter3;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-28 13:55
 */

public class ShowProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }

}

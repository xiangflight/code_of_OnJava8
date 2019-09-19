package chapter14;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/19 9:39 上午
 */

public class Informational {

    public static void main(String[] args) throws Exception {
        System.out.println(FileToWords.stream("src/chapter14/Cheese.dat").count());
        System.out.println(FileToWords.stream("src/chapter14/Cheese.dat").min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
        System.out.println(FileToWords.stream("src/chapter14/Cheese.dat").max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
    }

}

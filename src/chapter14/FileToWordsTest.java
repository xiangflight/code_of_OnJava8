package chapter14;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-29 19:14
 */

public class FileToWordsTest {

    public static void main(String[] args) throws Exception {
        FileToWords.stream("src/chapter14/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("src/chapter14/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }

}

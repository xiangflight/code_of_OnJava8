package chapter14;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/17 10:29 下午
 */

public class SpecialCollector {

    public static void main(String[] args) throws Exception {
        ArrayList<String> words = FileToWords.stream("/src/chapter14/Cheese.dat")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    }

}

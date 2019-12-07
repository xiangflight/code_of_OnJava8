package chapter20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */

public class ListOfInts {

    public static void main(String[] args) {
        List<Integer> li = IntStream.range(38, 48).boxed().collect(Collectors.toList());
        System.out.println(li);
    }

}

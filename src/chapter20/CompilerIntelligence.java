package chapter20;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/27
 */

public class CompilerIntelligence {

    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }

}

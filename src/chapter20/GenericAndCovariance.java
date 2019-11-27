package chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/27
 */

public class GenericAndCovariance {

    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
        Fruit f = flist.get(0);
    }

}

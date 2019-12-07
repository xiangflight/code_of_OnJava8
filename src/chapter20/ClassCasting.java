package chapter20;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */

public class ClassCasting {

    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        List<Widget> lw2 = List.class.cast(in.readObject());
    }
}

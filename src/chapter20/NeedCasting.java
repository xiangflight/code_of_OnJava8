package chapter20;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/7
 */

public class NeedCasting {

    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>)in.readObject();
    }

}

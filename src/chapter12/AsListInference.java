package chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-19 09:21
 */
class Snow {}
class Powder extends Snow {}
class Light extends Snow {}
class Heavy extends Snow {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Powder());
        snow3.add(new Crusty());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy(), new Slush());
    }

}

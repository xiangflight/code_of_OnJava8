package chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-15 14:01
 */

public class Parcel3 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.new Contents();
        Destination d = p.new Destination("Tasmania");
    }
}

package chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-16 12:56
 */

public class Parcel9 {
    public Destination destination(final String test) {
        return new Destination() {
            private String label = test;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }
}

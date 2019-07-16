package chapter11;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-16 13:50
 */

public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget!");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }

}

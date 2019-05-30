package chapter4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-30 23:06
 */

public class Underscores {

    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);

        System.out.println("%n");
    }

}

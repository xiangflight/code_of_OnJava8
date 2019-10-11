package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/11 9:13 上午
 */
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

//        try {
//            throw new Sneeze();
//        } catch (Annoyance a) {
//            System.out.println("Caught Annoyance");
//        } catch (Sneeze e) {
//            System.out.println("Caught Sneeze");
//        }
    }

}

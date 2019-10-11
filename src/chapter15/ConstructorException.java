package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/11 9:02 上午
 */
class CE extends Exception {}

class SecondExcept extends Reporter {

    SecondExcept() throws CE {
        super();
        throw new CE();
    }

}

public class ConstructorException {

    public static void main(String[] args) {
        try (First first = new First(); SecondExcept s = new SecondExcept(); Second s2 = new Second()) {
            System.out.println("In body");
        } catch (CE e) {
            System.out.println("Caught: " + e);
        }
    }

}

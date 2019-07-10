package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-09 17:53
 */

public interface Operations {

    void execute();

    static void runOps(Operations... ops) {
        for (Operations op: ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }

}

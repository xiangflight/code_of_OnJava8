package chapter12;

import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 11:20
 */

public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

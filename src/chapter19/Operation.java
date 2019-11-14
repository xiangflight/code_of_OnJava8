package chapter19;

import java.util.function.Supplier;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/14
 */

public class Operation {

    public final Supplier<String> description;
    public final Runnable command;

    public Operation(Supplier<String> descr, Runnable cmd) {
        description = descr;
        command = cmd;
    }

}

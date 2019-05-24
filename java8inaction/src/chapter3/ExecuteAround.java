package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-23 16:38
 */

public class ExecuteAround {

    public static void main(String[] args) throws IOException {
        String result = processFileLimited();
        System.out.println(result);

        System.out.println("---");

        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLines);
    }

    private static String processFileLimited() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/xiang/IdeaProjects/code_of_OnJava8/java8inaction/src/chapter3/data.txt"))) {
            return br.readLine();
        }
    }

    private static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/xiang/IdeaProjects/code_of_OnJava8/java8inaction/src/chapter3/data.txt"))) {
            return p.process(br);
        }
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor {
        /**
         * 处理br
         *
         * @param br br
         * @return 处理的结果
         * @throws IOException exception
         */
        String process(BufferedReader br) throws IOException;
    }
}

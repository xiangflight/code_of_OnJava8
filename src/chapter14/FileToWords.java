package chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-29 13:57
 */

public class FileToWords {

    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                .flatMap(line -> Arrays.stream(line.split("\\W+")));
    }

}

package chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-08-26 09:06
 */

public class FileToWordsBuilder {

    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+")) {
                        builder.add(w);
                    }
                });
    }

    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("src/chapter14/Cheese.dat").stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }

    Stream<String> stream() {
        return builder.build();
    }

}

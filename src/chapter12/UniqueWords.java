package chapter12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-07-20 10:58
 */

public class UniqueWords {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/chapter12/SetOperations.java"));
        Set<String> words = new TreeSet<>();
        for (String line: lines) {
            for (String word: line.split("\\W+")) {
                words.add(word);
            }
        }
        System.out.println(words);
    }
}

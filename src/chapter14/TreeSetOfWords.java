package chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/9/17 10:05 下午
 */

public class TreeSetOfWords {

    public static void main(String[] args) throws Exception {
        Set<String> words2 =
                Files.lines(Paths.get("src/chapter14/TreeSetOfWords.java"))
                .flatMap(s -> Arrays.stream(s.split("\\W")))
                .filter(s -> !s.matches("\\d+"))
                .map(String::trim)
                .filter(s -> s.length() > 2)
                .limit(100)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(words2);
    }

}

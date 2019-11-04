package chapter17;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

public class PartsOfPaths {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p  = Paths.get("PartsOfPaths.java").toAbsolutePath();
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
            System.out.println("end with '.java': " + p.endsWith(".java"));
        }
        for (Path pp: p) {
            System.out.print(pp + ": ");
            System.out.print(p.startsWith(pp) + ": ");
            System.out.print(p.endsWith(pp));
        }
        System.out.println("Start with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }

}

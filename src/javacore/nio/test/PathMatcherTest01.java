package javacore.nio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:**.txt");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**/file.???");
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
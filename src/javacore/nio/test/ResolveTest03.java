package javacore.nio.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("home/william");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1" + absoluto.resolve(relativo));
        System.out.println("2" + absoluto.resolve(file));
        System.out.println("3" + absoluto.resolve(absoluto));
        System.out.println("4" + absoluto.resolve(file));
        System.out.println("5" + absoluto.resolve(absoluto));
        System.out.println("5" + absoluto.resolve(relativo));
    }
}

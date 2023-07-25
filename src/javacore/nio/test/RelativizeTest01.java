package javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/dedojofoda/olaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/tempo.2021921");

        System.out.println("1" +absoluto1.relativize(absoluto3));
    }
}

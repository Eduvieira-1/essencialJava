package javacore.exception.exceptioN.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\ola.txt");

        boolean isCriado = file.createNewFile();
        System.out.println("Arquivo criado " + isCriado);

    }
}
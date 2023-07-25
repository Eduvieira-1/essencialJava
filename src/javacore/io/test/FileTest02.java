package javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File filediretorio = new File("pasta");
        boolean isDiretorioCreated = filediretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File(filediretorio,"sextou.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(filediretorio, "sextouuu.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = filediretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomeado);
    }
}

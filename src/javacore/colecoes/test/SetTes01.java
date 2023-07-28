package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTes01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new LinkedHashSet<>();
//        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L,"the originals", 100.25, 0));
        mangas.add(new Manga(3L,"the big bang theory", 14.85, 1));
        mangas.add(new Manga(2L,"the office", 15.23, 2));
        mangas.add(new Manga(4L,"the witcher", 45.85, 0));
        mangas.add(new Manga(4L,"the witcher", 45.85, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}

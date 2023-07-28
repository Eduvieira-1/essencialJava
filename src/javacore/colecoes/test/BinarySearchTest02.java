package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> series = new ArrayList<>(6);
        series.add(new Manga(1L, "the originals", 100.25));
        series.add(new Manga(3L, "the big bang theory", 14.85));
        series.add(new Manga(2L, "the office", 15.23));
        series.add(new Manga(4L, "the witcher", 45.85));

        series.sort(new MangaByIdComparator());

        for (Manga serie : series) {
            System.out.println(serie);
        }

        Manga mangaSearch = new Manga(3L, "the big bang theory", 14.85);
        System.out.println(Collections.binarySearch(series, mangaSearch, mangaByIdComparator));


    }
}

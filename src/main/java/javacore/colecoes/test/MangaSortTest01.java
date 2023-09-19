package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> series = new ArrayList<>(6);
        series.add(new Manga(1L,"the originals", 100.25));
        series.add(new Manga(3L,"the big bang theory", 14.85));
        series.add(new Manga(2L,"the office", 15.23));
        series.add(new Manga(4L,"the witcher", 45.85));

        for (Manga serie : series) {
            System.out.println(serie);
        }
        System.out.println("-------------------");
        Collections.sort(series);
        for (Manga serie : series) {
            System.out.println(serie);
        }
        System.out.println("-------------------");
//        Collections.sort(series, new MangaByIdComparator());
        series.sort(new MangaByIdComparator());
        for (Manga serie : series) {
            System.out.println(serie);
        }



    }
}

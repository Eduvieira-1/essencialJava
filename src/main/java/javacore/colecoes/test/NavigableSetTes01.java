package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;
import javacore.colecoes.dominio.Smartphone;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTes01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "apple");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L,"the originals", 100.25, 0));
        mangas.add(new Manga(3L,"the big bang theory", 12.25, 1));
        mangas.add(new Manga(2L,"the office", 15.60, 2));
        mangas.add(new Manga(4L,"a witcher", 45.85, 0));
        mangas.add(new Manga(4L,"the witcher", 45.85, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        Manga test = new Manga(21L, "the witcher", 15.12, 0);
        System.out.println("--------------");
        System.out.println(mangas.lower(test));
        System.out.println(mangas.floor(test));
        System.out.println(mangas.higher(test));
        System.out.println(mangas.ceiling(test));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

    }
}

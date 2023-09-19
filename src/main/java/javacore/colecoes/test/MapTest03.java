package javacore.colecoes.test;

import javacore.colecoes.dominio.Consumidor;
import javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Eduardo César");
        Consumidor c2 = new Consumidor("Miranha Cortella");

        Manga manga1 = new Manga(1L, "the originals", 100.25);
        Manga manga2 =new Manga(3L, "the big bang theory", 14.85);
        Manga manga3 =new Manga(2L, "the office", 15.23);
        Manga manga4 =new Manga(4L, "the witcher", 45.85);

        List<Manga> listMangas1 = List.of(manga1, manga2, manga3);
        List<Manga> listMangas2 = List.of(manga1, manga2);
        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(c1, listMangas1);
        consumidorListMap.put(c2, listMangas2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()){
            System.out.println("----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("------" + manga.getNome());
            }
        }



    }
}

package javacore.colecoes.test;

import javacore.colecoes.dominio.Consumidor;
import javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Eduardo César");
        Consumidor c2 = new Consumidor("Miranha Cortella");

        Manga manga1 = new Manga(1L, "the originals", 100.25);
        Manga manga2 =new Manga(3L, "the big bang theory", 14.85);
        Manga manga3 =new Manga(2L, "the office", 15.23);
        Manga manga4 =new Manga(4L, "the witcher", 45.85);

        Map<Consumidor, Manga> map = new HashMap<>();
        map.put(c1, manga1);

        for (Map.Entry<Consumidor, Manga> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}

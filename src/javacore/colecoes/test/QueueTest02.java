package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
       Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(1L,"the originals", 100.25, 0));
        mangas.add(new Manga(3L,"the big bang theory", 12.25, 1));
        mangas.add(new Manga(2L,"the office", 15.60, 2));
        mangas.add(new Manga(4L,"a witcher", 45.85, 0));
        mangas.add(new Manga(4L,"the witcher", 45.85, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}

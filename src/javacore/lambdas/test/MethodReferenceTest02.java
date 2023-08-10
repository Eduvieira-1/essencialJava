package javacore.lambdas.test;

import javacore.lambdas.dominio.Anime;
import javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("natsu no taizai", 80), new Anime("jujutsu kaizen", 15)));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
//        animeList.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic((a1,a2));
        System.out.println(animeList);
    }
}

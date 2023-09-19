package javacore.lambdas.test;

import javacore.lambdas.dominio.Anime;
import javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("natsu no taizai", 80), new Anime("jujutsu kaizen", 15)));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}

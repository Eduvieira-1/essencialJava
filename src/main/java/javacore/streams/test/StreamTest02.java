package javacore.streams.test;

import javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest02 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00),
            new LightNovel("jujutsu", 3.55),
            new LightNovel("natsu no taizai", 2.15),
            new LightNovel("digimon", 4.00),
            new LightNovel("naruto", 5.55)
    ));
    public static void main(String[] args) {
        List<String> lightNovelList = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(lightNovelList);

    }


}

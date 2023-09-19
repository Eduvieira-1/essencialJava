package javacore.streams.test;

import javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest06 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00),
            new LightNovel("jujutsu", 3.55),
            new LightNovel("natsu no taizai", 2.15),
            new LightNovel("digimon", 4.00),
            new LightNovel("naruto", 5.55)
    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3).min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }


}

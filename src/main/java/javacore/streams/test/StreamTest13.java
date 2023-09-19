package javacore.streams.test;

import javacore.streams.dominio.Category;
import javacore.streams.dominio.LightNovel;
import javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static javacore.streams.dominio.Promotion.*;

public class StreamTest13 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00, Category.DRAMA),
            new LightNovel("jujutsu", 3.55, Category.FANTASY),
            new LightNovel("natsu no taizai", 2.15, Category.DRAMA),
            new LightNovel("digimon", 4.00, Category.ROMANCE),
            new LightNovel("naruto", 5.55, Category.FANTASY)
    ));
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));
        System.out.println(collect1);

    }


}

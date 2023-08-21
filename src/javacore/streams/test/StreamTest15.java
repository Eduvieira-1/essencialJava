package javacore.streams.test;

import javacore.streams.dominio.Category;
import javacore.streams.dominio.LightNovel;
import javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static javacore.streams.dominio.Promotion.*;

public class StreamTest15 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00, Category.DRAMA),
            new LightNovel("jujutsu", 3.55, Category.FANTASY),
            new LightNovel("natsu no taizai", 2.15, Category.DRAMA),
            new LightNovel("digimon", 4.00, Category.ROMANCE),
            new LightNovel("naruto", 5.55, Category.FANTASY)
    ));
    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new) )));
        System.out.println(collect2);

    }


    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }

}

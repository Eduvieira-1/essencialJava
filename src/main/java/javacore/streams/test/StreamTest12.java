package javacore.streams.test;

import javacore.streams.dominio.Category;
import javacore.streams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00, Category.DRAMA),
            new LightNovel("jujutsu", 3.55, Category.FANTASY),
            new LightNovel("natsu no taizai", 2.15, Category.DRAMA),
            new LightNovel("digimon", 4.00, Category.ROMANCE),
            new LightNovel("naruto", 5.55, Category.FANTASY)
    ));
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
           switch (lightNovel.getCategory()){
               case DRAMA: drama.add(lightNovel); break;
               case FANTASY: fantasy.add(lightNovel); break;
               case ROMANCE: romance.add(lightNovel); break;

            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);
        System.out.println(categoryListMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }


}

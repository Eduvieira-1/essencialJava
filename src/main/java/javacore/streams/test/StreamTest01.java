package javacore.streams.test;

import javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {

   private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("dragon ball", 5.00),
            new LightNovel("jujutsu", 3.55),
            new LightNovel("natsu no taizai", 2.15),
            new LightNovel("digimon", 4.00),
            new LightNovel("naruto", 5.55)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }
            System.out.println(lightNovels);
            System.out.println(titles);


    }


}

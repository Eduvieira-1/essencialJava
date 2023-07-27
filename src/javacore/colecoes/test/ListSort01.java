package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {

        List<String> series = new ArrayList<>();
        series.add("the originals");
        series.add("the big bang theory");
        series.add("the office");
        series.add("the witcher");

        Collections.sort(series);

        List<Double> money = new ArrayList<>();
        money.add(100.21);
        money.add(58.53);
        money.add(45D);
        money.add(23.87);

        Collections.sort(money);

        for (String serie : series){
            System.out.println(serie);
        }

        System.out.println(money);

        new Manga(null, null, 23.23);
    }
}

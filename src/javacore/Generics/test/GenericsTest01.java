package javacore.Generics.test;

import javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("the originals");
        lista.add("the witcher");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("the originals"));

        for (Object o : lista) {
            System.out.println(o);
        }


    }

    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}

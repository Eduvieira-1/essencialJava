package javacore.Generics.test;

import javacore.Generics.dominio.Barco;

import java.util.Comparator;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Lancha"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

//    private static <T extends Comparator<T>> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}

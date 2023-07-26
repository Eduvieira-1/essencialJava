package javacore.colecoes.test;

import javacore.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "William Suane";
//        String nome2 = new String("William Suane");
//        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "phone");
        Smartphone s2 = new Smartphone("1ABC1", "phone");
        System.out.println(s1.equals(s2));

    }
}

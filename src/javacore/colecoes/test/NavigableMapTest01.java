package javacore.colecoes.test;

import javacore.colecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Eduardo César");
        Consumidor c2 = new Consumidor("Miranha Cortella");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println(map.headMap("C"));
        System.out.println(map.ceilingEntry("C"));
    }
}

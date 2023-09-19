package javacore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDudu = new ArrayList<>();
        List<String> graphic = List.of("miranha", "cortella", "spider", "man");
        List<String> devs = List.of("dudu", "edu", "du", "eduardo");
        List<String> students = List.of("dudu", "edu", "du", "eduardo");
        devDudu.add(graphic);
        devDudu.add(devs);
        devDudu.add(students);

        for (List<String> people : devDudu) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("---------------- stream ----------------");
        devDudu.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}

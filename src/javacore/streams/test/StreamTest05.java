package javacore.streams.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
       List<String> words = List.of("gnu", "gnomo", "do", "re", "mi");
       String[] letters = words.get(0).split("");
       System.out.println(Arrays.toString(letters));

       List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
       Stream<String> stream = Arrays.stream(letters);
       List<String> letters2 = words.stream()
               .map(w -> w.split("")) //Stream<String[]>
               .flatMap(Arrays::stream) //Stream<String>
               .collect(Collectors.toList());
        System.out.println(letters2);
    }
}

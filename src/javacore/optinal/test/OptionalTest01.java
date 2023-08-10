package javacore.optinal.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> nameOptional =  findName("dudu");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("dudu", "edu");
        int i = list.indexOf(name);
        if(i != 0){
            return Optional.of(list.get(i));
        }
        return  Optional.empty();
    }
}

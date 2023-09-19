package javacore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("dudu", "edu", "du", "eduardo");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        lists(integers, i -> System.out.println(i));
        lists(strings, s -> System.out.println(s));
    }


    private static <T> void lists(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }

    }
}

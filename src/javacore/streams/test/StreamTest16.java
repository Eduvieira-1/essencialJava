package javacore.streams.test;

import javacore.streams.dominio.Category;
import javacore.streams.dominio.LightNovel;
import javacore.streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static javacore.streams.dominio.Promotion.NORMAL_PRICE;
import static javacore.streams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParalleStreamIterate(num);
        sumLongStreamIterate(num);
        sumParalleLongStreamIterate(num);
    }

    private static void sumFor(long num){
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParalleStreamIterate(long num){
        System.out.println("sumParalleStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParalleLongStreamIterate(long num){
        System.out.println("sumParalleLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

}

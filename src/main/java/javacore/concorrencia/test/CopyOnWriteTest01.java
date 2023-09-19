package javacore.concorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable r = () -> {
            Iterator iterator = list.iterator();
            try{
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable remove = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s remove %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(r).start();
        new Thread(remove).start();
    }
}

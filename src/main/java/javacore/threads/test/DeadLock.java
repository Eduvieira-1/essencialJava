package javacore.threads.test;

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock 1");
                System.out.println("Thread 1: Esperando lock 2");
                synchronized (lock2){
                    System.out.println("Threado 1: segurando lock 2");
                }
            }
        };
        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 1: Segurando lock 1");
                System.out.println("Thread 1: Esperando lock 2");
                synchronized (lock1){
                    System.out.println("Threado 1: segurando lock 2");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();


    }
}

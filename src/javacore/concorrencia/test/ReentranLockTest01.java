package javacore.concorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try{
            System.out.printf("Thread %s entrou em uma sessão critica %n", name);
            System.out.printf("%d threads esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}

public class ReentranLockTest01 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new Worker("a", lock)).start();
        new Thread(new Worker("b", lock)).start();
        new Thread(new Worker("c", lock)).start();
        new Thread(new Worker("d", lock)).start();
        new Thread(new Worker("f", lock)).start();
        new Thread(new Worker("g", lock)).start();
        new Thread(new Worker("h", lock)).start();
    }
}

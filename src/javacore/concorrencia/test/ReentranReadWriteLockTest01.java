package javacore.concorrencia.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{
    private final Map<String, String> map = new HashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value){
        rwl.writeLock().lock();
        try{
            if(rwl.isWriteLocked()){
                System.out.printf("%s obteve o WRITE lock%n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys(){
        rwl.writeLock().lock();
        try{
            return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentranReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mrw = new MapReadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
               mrw.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if(rwl.isWriteLocked()){
                System.out.println("WRITE LOCKED!");
            }
            rwl.readLock().lock();
            System.out.println("FINALLY I GOT THE DAMN LOCK");
            try{
                System.out.println(Thread.currentThread().getName() + " " + mrw.allKeys());
            }finally {
                rwl.readLock().lock();
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);
        t1.start();
        t2.start();
        t3.start();
    }
}

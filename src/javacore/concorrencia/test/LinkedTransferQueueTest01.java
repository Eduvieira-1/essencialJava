package javacore.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue tq = new LinkedTransferQueue();
        System.out.println(tq.add("Edu"));
        System.out.println(tq.offer("dudu"));
        System.out.println(tq.offer("eduardo", 10, TimeUnit.SECONDS));
        tq.put("DevDudu");
        if(tq.hasWaitingConsumer()){
            tq.transfer("devdudu");
        }
        System.out.println(tq.tryTransfer("academy"));
        System.out.println(tq.tryTransfer("academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}

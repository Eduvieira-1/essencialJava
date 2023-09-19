package javacore.jdbc.test;

import javacore.jdbc.dominio.Producer;
import javacore.jdbc.service.ProducerService;
import javacore.jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("dragon ball").build();
        Producer producer2 = Producer.builder().name("natzu no taizai").build();
        Producer producer3 = Producer.builder().name("jujutsu kaizen").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}

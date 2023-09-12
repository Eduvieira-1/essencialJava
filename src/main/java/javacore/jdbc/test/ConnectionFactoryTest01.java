package javacore.jdbc.test;

import javacore.jdbc.conn.ConnectionFacotry;
import javacore.jdbc.dominio.Producer;
import javacore.jdbc.repository.ProducerRepository;
import javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Scanner;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("dragon ball").build();
        Producer producerToUpdate = Producer.builder().id(3).name("Itachi").build();
//        ProducerService.save(producer);
//        ProducerService.delete(6);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);

//        ProducerService.showProducerMetaData();
//        ProducerService.showTypesScrollWorking();
//          ProducerService.findByNameAndUpdateToUpperCase("itachi");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pic");
         ProducerService.findByNameAndDelete("A-1 pic");
//        log.info("Producers found '{}'", producers);


//        log.info("");
//        log.debug("");
//        log.warn("");
//        log.error("");
//        log.trace("");

    }
}

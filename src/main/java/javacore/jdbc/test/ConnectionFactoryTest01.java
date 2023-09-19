package javacore.jdbc.test;

import javacore.jdbc.dominio.Producer;
import javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("dragon ball").build();
        Producer producerToUpdate = Producer.builder().id(3).name("Naruto").build();
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
//         ProducerService.findByNameAndDelete("A-1 pic");
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
//        log.info("Producers found '{}'", producers);

//        ProducerService.updatePreparedStament(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("ssss");
        log.info("Producers found '{}'", producers);

//        log.info("");
//        log.debug("");
//        log.warn("");
//        log.error("");
//        log.trace("");

    }
}

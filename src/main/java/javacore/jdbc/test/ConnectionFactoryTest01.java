package javacore.jdbc.test;

import javacore.jdbc.conn.ConnectionFacotry;
import javacore.jdbc.dominio.Producer;
import javacore.jdbc.repository.ProducerRepository;
import javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Informe um nome de anime: ");
//        String name = sc.next();

        Producer producer = Producer.builder().name("edu").build();
//        ProducerService.save(producer);
        ProducerService.delete(6);

//        log.info("");
//        log.debug("");
//        log.warn("");
//        log.error("");
//        log.trace("");

    }
}

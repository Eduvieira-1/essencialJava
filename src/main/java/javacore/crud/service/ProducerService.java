package javacore.crud.service;

import javacore.crud.dominio.Producer;
import javacore.crud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SC = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all: ");
        String name = SC.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        ProducerRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete");
        int id = Integer.parseInt(SC.nextLine());
        System.out.println("Are you sure ? S/N");
        String choice = SC.nextLine();
        if ("s".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save(){
        System.out.println("Type the name of the producer");
        String name = SC.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update(){
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SC.nextLine()));
        if(producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("test");
        System.out.println("Producer found " + producerFromDb);
        System.out.println("Type the new name or enter to keep the same:");
        String name = SC.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepository.update(producerToUpdate);
    }
}

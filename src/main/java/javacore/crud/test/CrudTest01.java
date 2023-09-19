package javacore.crud.test;

import javacore.crud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            producerMenu();
            op = Integer.parseInt(SC.nextLine());
            if(op == 0) break;
            ProducerService.menu(op);
        }
    }

    private static void producerMenu(){
        System.out.println("Type the number of yout operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("0. Exit");
        System.out.println("----------------------------------");
    }
}

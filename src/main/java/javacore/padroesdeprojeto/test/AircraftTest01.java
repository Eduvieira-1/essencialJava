package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.dominio.Aircraft;
import javacore.padroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
//        AircraftTest01.bookSeat();
    }

     static void bookSeat(String seat){
         System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }

}

package javacore.Generics.test;

import javacore.Generics.dominio.Barco;
import javacore.Generics.dominio.Carro;
import javacore.Generics.service.BarcoRentavelService;
import javacore.Generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponiveis();
        System.out.println("usando carro por um mês");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("-----------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponiveis();
        System.out.println("usando carro por um mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}

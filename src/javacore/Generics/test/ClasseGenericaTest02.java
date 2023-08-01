package javacore.Generics.test;

import javacore.Generics.dominio.Barco;
import javacore.Generics.dominio.Carro;
import javacore.Generics.service.BarcoRentavelService;
import javacore.Generics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponiveis();
        System.out.println("usando barco por um mês");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}

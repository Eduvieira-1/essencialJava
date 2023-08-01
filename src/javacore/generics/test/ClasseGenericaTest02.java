package javacore.generics.test;

import javacore.generics.dominio.Barco;
import javacore.generics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponiveis();
        System.out.println("usando barco por um mês");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}

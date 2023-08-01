package javacore.Generics.test;

import javacore.Generics.dominio.Carro;
import javacore.Generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponiveis();
        System.out.println("usando carro por um mês");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}

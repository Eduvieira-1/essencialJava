package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;
import javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();

		System.out.println(Carro.VELOCIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Goku");
		System.out.println(carro.COMPRADOR);
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Klaus");
		ferrari.imprime();
	}

}

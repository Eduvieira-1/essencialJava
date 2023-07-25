package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculaImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computador computador = new Computador("NUC10i7 ", 11000);
		Tomate tomate = new Tomate("Tomate vermelho ", 10);
		Televisao tv = new Televisao("Samsung 50\" ", 5000);
		
		CalculaImposto.calcularImposto(computador);
		System.out.println("--------------------------------");
		CalculaImposto.calcularImposto(tomate);
		System.out.println("--------------------------------");
		CalculaImposto.calcularImposto(tv);

	}

}

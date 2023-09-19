package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculaImposto;

public class ProdutoTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Computador("Ryzen 9", 3000);

		Tomate tomate = new Tomate("Americano", 20);
		tomate.setDataValidade("25/01/2023");

		CalculaImposto.calcularImposto(tomate);
		System.out.println("--------------------------------");
		CalculaImposto.calcularImposto(produto);

	}

}

package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class CalculaImposto {

	public static void calcularImposto(Produto produto) {
		System.out.println("Relatorio de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getDataValidade());
		}
	}

}

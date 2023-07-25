package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;

public class JogadorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogador jogador1 = new Jogador("Pele");
		Jogador jogador2 = new Jogador("Romário");
		Jogador jogador3 = new Jogador("Cafu");
		Jogador[] jogadores = {jogador1, jogador2, jogador3};

		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}

}

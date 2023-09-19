package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogador jogador1 = new Jogador("Pele");
		Time time = new Time("Seleção brasileira");
		jogador1.setTime(time);
		jogador1.imprime();
	}

}

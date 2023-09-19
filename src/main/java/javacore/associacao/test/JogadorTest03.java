package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogador jogador = new Jogador("Pele");
		Jogador jogador2 = new Jogador("Romario");

		Time time = new Time("Brasil");
		Jogador[] jogadores = {jogador, jogador2};
		
		jogador.setTime(time);
		jogador2.setTime(time);
		
		time.setJogadores(jogadores);
		
		System.out.println("---- Jogador ----");
		
		jogador.imprime();
		
		System.out.println("---- Time ----");
		
		time.imprime();
	}

}

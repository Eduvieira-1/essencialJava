package javacore.blocosinicializacao.test;

import javacore.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anime anime = new Anime();
		
		for (int ep : anime.getEpisodios()) {
			System.out.println(ep + " ");
		}
	}

}

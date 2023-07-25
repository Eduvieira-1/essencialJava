package javacore.sobrecargametodos.test;

import javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anime anime = new Anime();
		anime.init("Dragon ball", "TV", 12);
		anime.init("Dragon ball 2", "TV", 12, "Ação");
		anime.imprime();
		
	}

}

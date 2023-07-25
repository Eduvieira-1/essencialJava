package javacore.modificadoresestatico.dominio;

public class Anime {

	private String nome;
	private static int[] episodios;
	// 0 - Bloco de inicialização estatico é executado quando a JVM carregar a classe
	// 1 - Alocado espaço em memória pro objeto
	// 2 - cada atributo de classe é criado e inicializado com valores default ou o que for passado
	// 3 - Bloco de inicialização é executado
	// 4 - Construtor é executado
	
	static {
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}
	
	
	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		for(int ep : Anime.episodios) {
			System.out.println(ep + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	
	
}

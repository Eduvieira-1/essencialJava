package javacore.modificadoresestatico.dominio;

public class Anime {

	private String nome;
	private static int[] episodios;
	// 0 - Bloco de inicializa��o estatico � executado quando a JVM carregar a classe
	// 1 - Alocado espa�o em mem�ria pro objeto
	// 2 - cada atributo de classe � criado e inicializado com valores default ou o que for passado
	// 3 - Bloco de inicializa��o � executado
	// 4 - Construtor � executado
	
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

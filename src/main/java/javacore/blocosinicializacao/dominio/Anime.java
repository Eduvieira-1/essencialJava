package javacore.blocosinicializacao.dominio;

public class Anime {

	private String nome;
	private int[] episodios;
	// 1 - Alocado espa�o em mem�ria pro objeto
	// 2 - cada atributo de classe � criado e inicializado com valores default ou o que for passado
	// 3 - Bloco de inicializa��o � executado
	// 4 - Construtor � executado
	
	{
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i + 1;
		}
	}
	
	
	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		for(int ep : this.episodios) {
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

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
	
	
}

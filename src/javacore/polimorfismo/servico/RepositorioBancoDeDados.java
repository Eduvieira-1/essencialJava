package javacore.polimorfismo.servico;

import javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em um banco de dados");
	}

	
}

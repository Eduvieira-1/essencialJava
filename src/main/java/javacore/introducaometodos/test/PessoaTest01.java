package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Dudu");
		pessoa.setIdade(22);
	//	pessoa.imprime();
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());

	}

}

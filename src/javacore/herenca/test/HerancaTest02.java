package javacore.herenca.test;

import javacore.herenca.dominio.Endereco;
import javacore.herenca.dominio.Funcionario;
import javacore.herenca.dominio.Pessoa;

public class HerancaTest02 {

		// 0 - Bloco de inicializa��o estatico da super classe � executado quando a JVM carregar a classe pai
		// 1 - Bloco de inicializa��o estatico da sub classe � executado quando a JVM carregar a classe filha
		// 2 - Alocado espa�o em mem�ria pro objeto da superclasse
		// 3 - Cada atributo de superclasse � criado e inicializado com valores default ou o que for passado
		// 4 - Bloco de inicializa��o da superclasse � executado na ordem em que aparece	
		// 5 - Construtor � executado da superclasse
		// 6 - Alocado espa�o em mem�ria pro objeto da subclasse
		// 7 - Cada atributo de subclasse � criado e inicializado com valores default ou o que for passado da classe pai
		// 8 - Bloco de inicializa��o da subclasse � executado na ordem em que aparece	
		// 9 - Construtor � executado da subclasse
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua iguatama");
		endereco.setCep("38026-100");
		Pessoa pessoa = new Pessoa("Meliodas");
		pessoa.setCpf("02112702359");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		Funcionario fun = new Funcionario("Saitama");
		fun.setCpf("000000");
		fun.setEndereco(endereco);
		fun.setSalario(2000);
		System.out.println("----------");
		fun.imprime();
	}

}

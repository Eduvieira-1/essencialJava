package javacore.polimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Na orientação a interface esse exemplo o repositorio que é a interface pode gerenciar por ele após o new o que ira salvar no caso
		// está salvando "RepositorioMemoria()" mas poderia ser "RepositorioArquivo()" e etc.
		Repositorio repositorio = new RepositorioMemoria();
		repositorio.salvar();
		List<String> list = new LinkedList<>();
		list.add("Goku");
		list.add("Goten");
		list.add("Gohan");
		System.out.println(list);
	}

}

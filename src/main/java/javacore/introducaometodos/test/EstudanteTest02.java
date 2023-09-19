package javacore.introducaometodos.test;


import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		estudante01.nome = "Eduardo";
		estudante01.idade = 22;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Dudu";
		estudante02.idade = 22;
		estudante02.sexo = 'M';
		
		estudante01.imprime();
		estudante02.imprime();

	}

}

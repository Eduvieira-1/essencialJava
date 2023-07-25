package javacore.introducaometodos.test;


import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante imp = new ImpressoraEstudante();

		estudante01.nome = "Eduardo";
		estudante01.idade = 22;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Dudu";
		estudante02.idade = 22;
		estudante02.sexo = 'M';
		
		imp.imprime(estudante01);
		imp.imprime(estudante02);

	}

}

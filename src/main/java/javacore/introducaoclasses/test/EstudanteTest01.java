package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudante estudante = new Estudante();
		estudante.nome = "Eduardo";
		estudante.idade = 22;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);

		
	}

}

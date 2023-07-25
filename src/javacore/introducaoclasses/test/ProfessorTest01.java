package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Professor prof = new Professor();
		prof.nome = "Klaus";
		prof.idade = 31;
		prof.sexo = 'M';
		
		System.out.println("O professor " + prof.nome + ", que tem " + prof.idade + " anos, do sexo " + prof.sexo);
		
		
		
	}

}

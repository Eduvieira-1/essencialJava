package javacore.associacao.test;

import javacore.associacao.dominio.Aluno;
import javacore.associacao.dominio.Local;
import javacore.associacao.dominio.Professor;
import javacore.associacao.dominio.Seminario;

public class AssociacaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Local local = new Local("Rua iguatama");
		Aluno aluno = new Aluno("Eduardo", 22);
		Aluno aluno2 = new Aluno("Dudu", 22);
		Professor professor = new Professor("Klaus", "planos");
		Aluno[] alunoSeminario = {aluno, aluno2};
		Seminario seminario = new Seminario("Trabalho java", alunoSeminario, local);
		
		Seminario[] seminarios = {seminario};
		
		professor.setSeminarios(seminarios);
		
		professor.imprime();
	}

}

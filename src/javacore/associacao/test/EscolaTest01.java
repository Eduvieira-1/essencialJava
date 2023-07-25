package javacore.associacao.test;

import javacore.associacao.dominio.Escola;
import javacore.associacao.dominio.Professor;

public class EscolaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor professor = new Professor("Jiraya Sensei");
		Professor professor2 = new Professor("Jiraya Sensei");
		Professor[] professores = {professor, professor2};
		Escola escola = new Escola("Konoha", professores);
		escola.imprime();
	}

}

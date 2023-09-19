package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario fun = new Funcionario();
		fun.setNome("Eduardo");
		fun.setIdade(22);
		fun.setSalarios(new double[] {1200, 2500, 4500});
		
		fun.imprime();
	}

}

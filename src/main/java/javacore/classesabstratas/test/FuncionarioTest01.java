package javacore.classesabstratas.test;

import javacore.classesabstratas.dominio.Desenvolvedor;
import javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente("Saitama", 5000);
		Desenvolvedor dev = new Desenvolvedor("Goku", 12000);

		System.out.println(gerente);
		System.out.println(dev);
	}

}

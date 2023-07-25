package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora cal = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		cal.somaArray(numeros);
		cal.somaVarArgs(1,2,3,4,5);
	}

}

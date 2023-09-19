package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora cal = new Calculadora();
		int num1 = 1;
		int num2 = 2;
		cal.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do calculadoraTes04");
		System.out.println(num1);
		System.out.println(num2);
	}

}

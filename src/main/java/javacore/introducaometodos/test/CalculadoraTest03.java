package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora cal = new Calculadora();
		int result = (int) cal.divideDoisNumeros(20, 2);
		int result2 = (int) cal.divideDoisNumeros2(20, 2);

		System.out.println("Finalizando calculadora");
		System.out.println(cal.divideDoisNumeros(20, 2));
		System.out.println(cal.divideDoisNumeros2(20, 2));
		System.out.println("------------------------------");
		cal.imprimeDivisao(86, 0);
	}

}

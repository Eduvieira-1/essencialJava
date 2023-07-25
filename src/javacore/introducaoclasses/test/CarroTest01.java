package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro car = new Carro();
		Carro car2 = new Carro();
		
		
		car.nome = "Fusca bala";
		car.modelo = "sport";
		car.ano = 1969;
		
		car2.nome = "Mustang";
		car2.modelo = "GT 500";
		car2.ano = 1968;

		System.out.println("Carro 1");
		System.out.println(car.nome);
		System.out.println(car.modelo);
		System.out.println(car.ano);
		System.out.println("-----------------------");
		System.out.println("Carro 2");
		System.out.println(car2.nome);
		System.out.println(car2.modelo);
		System.out.println(car2.ano);


	}

}

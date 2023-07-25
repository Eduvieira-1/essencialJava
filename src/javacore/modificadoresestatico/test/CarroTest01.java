package javacore.modificadoresestatico.test;

import javacore.modificadoresestatico.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro.setVelocidadeLimite(180);
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Mercedes", 280);
		Carro c3 = new Carro("Audi", 280);
		
		
		c1.imprime();
		c2.imprime();
		c3.imprime();


	}

}

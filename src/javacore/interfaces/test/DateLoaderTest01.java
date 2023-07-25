package javacore.interfaces.test;

import javacore.interfaces.dominio.DateBaseLoader;
import javacore.interfaces.dominio.FileLoader;

public class DateLoaderTest01 {

	public static void main(String[] args) {
		
		DateBaseLoader dbl = new DateBaseLoader();
		FileLoader fl = new FileLoader();
		dbl.load();
		fl.load();
		
		dbl.remove();
		fl.remove();
	}

}

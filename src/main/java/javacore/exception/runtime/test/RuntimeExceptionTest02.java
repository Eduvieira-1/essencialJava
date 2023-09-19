package javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisao(1,0);
	}
	
	private static int divisao(int a, int b) {
		if(b == 0) {
			throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
		}
		return a/b;
	}

}

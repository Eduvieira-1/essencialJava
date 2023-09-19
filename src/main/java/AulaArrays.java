
public class AulaArrays {

	public static void main(String[] args) {
		// byte, short, int, long, float e double 0
		// char '\u0000' ''
		// boolean false
		// String null
		
		String[] nomes = new String[4];
		nomes[0] = "Goku";
		nomes[1] = "Goten";
		nomes[2] = "Saitama";
		nomes[3] = "Naruto";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

		
	}

}

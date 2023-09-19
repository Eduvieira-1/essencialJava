
public class AulaRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while, do while, for
		
		int count = 12;
		
		while(count < 10) {
			System.out.println(count);
			count += 1;
		}
		
		do {
			System.out.println("dentro do do-while");
		} while(count < 10);
		
		for(int i=0; i <= 10; i++) {
			System.out.println("For " + i);
		}
	}

}

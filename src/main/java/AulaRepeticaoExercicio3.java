
public class AulaRepeticaoExercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while, do while, for

		double valorTotal = 30000;

		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela " + parcela + "R$ " + valorParcela);
		}


	}

}
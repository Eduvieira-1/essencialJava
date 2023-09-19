
public class AulaRepeticaoExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while, do while, for

		double valorTotal = 30000;

		for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela " + parcela + " R$ " + valorParcela);
		}

	}

}

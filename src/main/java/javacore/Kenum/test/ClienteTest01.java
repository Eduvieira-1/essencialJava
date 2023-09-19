package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Goku", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente c2 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente.getNomeRelatorio());
		TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
		System.out.println(tipoCliente2);


	}

}

package questao1;

public class ContaBancaria {

	public static void main(String[] args) {

		Conta cp = new ContaPoupanca();
		cp.setSaldo(3500);
		cp.imprimeExtrato();
	}

}

package Conta.model;

public class TesteConta {

	public static void main(String[] args) {

		// teste da classe Conta

		Conta c1 = new Conta(1, 1234, 1, "Daiane", 20000.0f);
		c1.visualizar();
		c1.sacar(22000.0f);
		c1.visualizar();
		c1.depositar(10000);
		c1.visualizar();

		ContaCorrente cc1 = new ContaCorrente(2, 1234, 1, "Rosa", 15000.0f, 10000.0f);
		c1.visualizar();
		c1.sacar(22000.0f);
		c1.visualizar();
		c1.depositar(10000);
		c1.visualizar();

		ContaPoupanca cp = new ContaPoupanca(3, 123, 2, "Thata", 100000.0f, 25);
		c1.visualizar();
		c1.sacar(22000.0f);
		c1.visualizar();
		c1.depositar(10000);
		c1.visualizar();
	}

}

package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.controller.ContaController;
import Conta.model.Conta;
import Conta.model.ContaCorrente;
import Conta.model.ContaPoupanca;
import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaController contas = new ContaController();
		Scanner leia = new Scanner(System.in);
		int op, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar contas: ");
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123,1, "João",11110f,111.0f);
		contas.cadastrar(cc1);
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124,1, "MAria",11110f,111.0f);
		contas.cadastrar(cc2);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 124,1, "MAria",11110f,15);
		contas.cadastrar(cp1);

		contas.listarTodas();
		

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*************************************************************************");
			System.out.println("*************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\tBANCO DO BRAZIL");
			System.out.println("                                                                         ");
			System.out.println("                                                                         ");
			System.out.println("*************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\t1 - Criar conta");
			System.out.println("\n\t\t\t2 - Listar todas as contas");
			System.out.println("\n\t\t\t3 - Buscar conta por número");
			System.out.println("\n\t\t\t4 - Atualizar dados da conta");
			System.out.println("\n\t\t\t5 - Apagar conta");
			System.out.println("\n\t\t\t6 - Sacar");
			System.out.println("\n\t\t\t7 - Depositar");
			System.out.println("\n\t\t\t8 - Transferir valores");
			System.out.println("\n\t\t\t9 - Sair");
			System.out.println("                                                                         ");
			System.out.println("*************************************************************************");
			System.out.println("\nEntre com a opção desejada:");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				op = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				op = 0;
			}

			if (op == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil agradece! O futuro começa aqui.");
				leia.close();
				System.exit(0);
			}
			switch (op) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t1 - Criar conta");

				System.out.println("\nDigite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("\nDigite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("\nDigite o tipo de conta (1-CC ou 2-CP)");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("\nDigite o saldo da conta(R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("\nDigite o limite de crédito: ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("\nDigite o dia do aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}

				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t2 - Listar todas as contas");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t3 - Buscar conta por número");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t4 - Atualizar dados da conta");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t5 - Apagar conta");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t6 - Sacar");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t7 - Depositar");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t8 - Transferir valores");
				keyPress();
				break;
			case 9:
				System.out.println(Cores.TEXT_WHITE + "\n\t\t\t9 - Sair");
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\n\t\t\tOpção Inválida!\n");

			}
		}

	}

	private static void keyPress() {
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}

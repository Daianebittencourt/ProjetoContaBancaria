package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.model.Conta;
import Conta.model.ContaCorrente;
import Conta.model.ContaPoupanca;
import Conta.util.Cores;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int op;
		

		ContaCorrente cc1 = new ContaCorrente(2, 1234, 1, "Rosa", 15000.0f, 10000.0f);
		cc1.visualizar();
		cc1.sacar(22000.0f);
		cc1.visualizar();
		cc1.depositar(10000);
		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Thata", 100000.0f, 25);
		cp1.visualizar();
		cp1.sacar(22000.0f);
		cp1.visualizar();
		cp1.depositar(10000);
		cp1.visualizar();
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND+"*************************************************************************");                                                          
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
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				op=0;
			}
			
			if (op==9) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco do Brazil agradece! O futuro começa aqui.");
				leia.close();
				System.exit(0);
			}
			switch (op){
			case 1: 
				System.out.println(Cores.TEXT_WHITE +"\n\t\t\t1 - Criar conta");
				keyPress();
				break;
			case 2: 
				System.out.println(Cores.TEXT_WHITE +"\n\t\t\t2 - Listar todas as contas");
				keyPress();
				break;
			case 3: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t3 - Buscar conta por número");
				keyPress();
				break;
			case 4: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t4 - Atualizar dados da conta");
				keyPress();
				break;
			case 5: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t5 - Apagar conta");
				keyPress();
				break;
			case 6: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t6 - Sacar");
				keyPress();
				break;
			case 7: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t7 - Depositar");
				keyPress();
				break;
			case 8: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t8 - Transferir valores");
				keyPress();
				break;
			case 9: 
				System.out.println(Cores.TEXT_WHITE+"\n\t\t\t9 - Sair");
				keyPress();
				break;
				
				default:
					System.out.println(Cores.TEXT_RED_BOLD+"\n\t\t\tOpção Inválida!\n");
					
			
				
			
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

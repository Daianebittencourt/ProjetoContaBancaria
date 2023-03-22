package Conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int op;
		
		while (true) {
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
			System.out.println("                                                                         ");
			
			op = leia.nextInt();
			
			if (op==9) {
				System.out.println("\nBanco do Brazil agradece! O futuro começa aqui.");
				leia.close();
				System.exit(0);
			}
			switch (op){
			case 1: 
				System.out.println("\n\t\t\t1 - Criar conta");
				break;
			case 2: 
				System.out.println("\n\t\t\t2 - Listar todas as contas");
				break;
			case 3: 
				System.out.println("\n\t\t\t3 - Buscar conta por número");
				break;
			case 4: 
				System.out.println("\n\t\t\t4 - Atualizar dados da conta");
				break;
			case 5: 
				System.out.println("\n\t\t\t5 - Apagar conta");
				break;
			case 6: 
				System.out.println("\n\t\t\t6 - Sacar");
				break;
			case 7: 
				System.out.println("\n\t\t\t7 - Depositar");
				break;
			case 8: 
				System.out.println("\n\t\t\t8 - Transferir valores");
				break;
			case 9: 
				System.out.println("\n\t\t\t9 - Sair");
				break;
				
				default:
					System.out.println("\n\t\t\tOpção Inválida!\n");
					
			
				
			
			}
		}
			
		
		
	}

}

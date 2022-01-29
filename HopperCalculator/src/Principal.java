import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int ask=1;
		
		Funcionario user = new Funcionario();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o nome do funcion�rio?... ");
		user.nome = scan.nextLine();
		
		System.out.println("Qual a fun��o do funcion�rio?... ");
		user.funcao = scan.nextLine();
		
		System.out.println("Qual o CPF do funcion�rio?... ");
		user.CPF = scan.nextInt();
		
		
		do {
			System.out.println("\nEscolha uma das op��es:");
			System.out.println("1. C�lcular sal�rio.");
			System.out.println("2. Sair.");
			System.out.println("[1/2]...");
			int opcao = scan.nextInt();
			
			
			switch(opcao) {
				case 1:
					System.out.println("Qual o valor do total das horas trabalhadas?... ");
					user.horasTrabalhadas = scan.nextDouble();
					CalculadorSalario calc = new CalculadorSalario();
					System.out.println("O sal�rio correspondente �s horas trabalhadas: " + calc.getTotal(user));
					break;
					
				case 2:
					break;
					
				default:
					System.out.println("\nOp��o inv�lida\n");
					break;
					
			}
			
			System.out.println("\nDeseja continuar calculando?");
			System.out.println("1 - sim");
		    System.out.println("2 - n�o");
		    System.out.println("Favor digitar a op��o desejada: ...");
		    ask = scan.nextInt();
				
		} while(ask == 1);
		
		if (scan != null) {
	        scan.close();
	    }

	}

}

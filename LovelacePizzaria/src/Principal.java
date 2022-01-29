
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		int ask=1;
		
		CarrinhoDeCompras user = new CarrinhoDeCompras();  
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Escolha uma das opções:");
			System.out.println("1. Pizza #C alabresa.");
			System.out.println("2. Pizza Pythonic 5 queijos");
			System.out.println("3. Pizza Java com Catupiry");
			System.out.println("Qual pizza gostaria de comprar? [1/2/3]...");
			int opcao = scan.nextInt();
			
			switch (opcao){
	        case 1:
	        	Pizza calabresa = new Pizza();
	        	calabresa.adicionaIngrediente("calabresa");
	        	calabresa.adicionaIngrediente("cebola");
	        	user.adicionaPizza(calabresa);
	        	break;
	        case 2:
	        	Pizza queijo5 = new Pizza();
	        	queijo5.adicionaIngrediente("gorgonzola");
	        	queijo5.adicionaIngrediente("provolone");
	        	queijo5.adicionaIngrediente("parmesão");
	        	queijo5.adicionaIngrediente("muçarela");
	        	queijo5.adicionaIngrediente("catupiry");
	        	user.adicionaPizza(queijo5);
	            break;
	        case 3:
	        	Pizza java = new Pizza();
	        	java.adicionaIngrediente("javali");
	        	java.adicionaIngrediente("espinafre");
	        	java.adicionaIngrediente("azeitona");
	        	java.adicionaIngrediente("tomate");
	        	java.adicionaIngrediente("oregano");
	        	java.adicionaIngrediente("maçã");
	        	java.adicionaIngrediente("abacaxi");
	        	user.adicionaPizza(java);
	        	break;
	        default:
	        	System.out.println("Opção inválida");
	        	break;
			}		
			System.out.println("Pizza adicionada com sucesso!");
			
			//Scanner s = new Scanner(System.in);	        
			System.out.println("Deseja continuar comprando?");
			System.out.println("1 - sim");
		    System.out.println("2 - não");
		    System.out.println("Favor digitar a opção desejada: ...");
		    ask = scan.nextInt();
		    
		}while(ask == 1);
		
		if (scan != null) {
	        scan.close();
	    }
		
		System.out.println("Preço total a pagar: "+user.getValorTotal());
		
		Set<String> ingredientes = Pizza.listaIngredientes.keySet();
		
		for(String ingrediente : ingredientes) {
			System.out.println("Ingrediente "+ingrediente+"\t");
		}
	}

}

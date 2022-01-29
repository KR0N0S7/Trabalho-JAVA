
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	ArrayList<String> ingredientes;
	double preco;
	int quantiaIngredientes;
	
	public Pizza() {
		this.ingredientes = new ArrayList<String>();
		this.preco = 0;
		this.quantiaIngredientes = 0;
	}
	
	public static HashMap<String, Integer> listaIngredientes = new HashMap<String, Integer>();
		
	public void adicionaIngrediente(String topping){
		ingredientes.add(topping);
		contabilizaIngredientes(topping);
		
	}
	
	public static void contabilizaIngredientes(String topping) {
		listaIngredientes.compute(topping, (k, v) -> v == null ? 1 : v + 1);
	}
	
		
	public boolean verificadorIngredientes () {
		return !ingredientes.isEmpty();
	}
	
	public double getPreco() {
		quantiaIngredientes = ingredientes.size();
		
		if(quantiaIngredientes >= 1 && quantiaIngredientes <= 2) {
			preco = 15.00;
		}
		else if(quantiaIngredientes >= 3 && quantiaIngredientes <= 5) {
			preco = 20.00;
		}
		else if(quantiaIngredientes > 5){
			preco = 23.00;
		}
		return preco;
	}
	
	public static Map<String, Integer> getTotalIngredientes(){
		return listaIngredientes;
	}
}

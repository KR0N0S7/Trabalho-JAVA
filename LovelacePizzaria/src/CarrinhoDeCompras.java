
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList <Pizza> quantiaPizza;
	double valorTotal;
	
	public CarrinhoDeCompras() {
		this.quantiaPizza = new ArrayList <Pizza>();
		this.valorTotal = 0;
	}
	
	public void adicionaPizza(Pizza p) {
		
		if(!p.verificadorIngredientes()) { }
			quantiaPizza.add(p);
			
	}
	
	public double getValorTotal() {
		for(Pizza p: quantiaPizza) {
			valorTotal += p.getPreco();
		}
		return valorTotal;
	}
}

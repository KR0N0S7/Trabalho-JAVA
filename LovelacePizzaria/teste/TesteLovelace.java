import static org.junit.Assert.*;

import org.junit.Test;

public class TesteLovelace {

	@Test
	public void testValorPizza() {
		CarrinhoDeCompras user = new CarrinhoDeCompras();
		Pizza p = new Pizza();
		p.adicionaIngrediente("x");
    	p.adicionaIngrediente("y");
    	user.adicionaPizza(p);
    	assertEquals(15.00,p.getPreco(),0.00);
	}

	@Test
	public void testRegistroIngredientes() {
		CarrinhoDeCompras user = new CarrinhoDeCompras();
		Pizza p = new Pizza();
		p.adicionaIngrediente("x");
    	p.adicionaIngrediente("y");
    	user.adicionaPizza(p);
    	assertEquals(true,p.verificadorIngredientes());
	}
	
	@Test
	public void testCarrinhoDeComprasPreco() {
		CarrinhoDeCompras user = new CarrinhoDeCompras();
		Pizza p = new Pizza();
		p.adicionaIngrediente("x");
    	p.adicionaIngrediente("y");
    	user.adicionaPizza(p);
    	
    	Pizza r = new Pizza();
		r.adicionaIngrediente("x");
    	r.adicionaIngrediente("y");
    	r.adicionaIngrediente("z");
    	user.adicionaPizza(r);
    	
    	assertEquals(35.00,user.getValorTotal(),0.00);
	}
	
	@Test
	public void testCarrinhoDeComprasPizzaSemIngrediente() {
		CarrinhoDeCompras user = new CarrinhoDeCompras();
		Pizza p = new Pizza();
		user.adicionaPizza(p);
    	assertEquals(false,p.verificadorIngredientes());
	}
}

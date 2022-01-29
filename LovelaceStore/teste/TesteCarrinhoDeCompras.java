import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {
	
	ProdutoComTamanho t1;
	ProdutoComTamanho t2;
	ProdutoComTamanho t3;
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	@Before
	public void Before() {
		t1 = new ProdutoComTamanho("Arroz Neuman", 00701, 40.00, 25);
		t2 = new ProdutoComTamanho("Feijão Turing", 00702, 70.00, 7);
		t3 = new ProdutoComTamanho("Batata Hopper", 00703, 50.00, 12);
	}
	
	@Before
	public void limpaCarrinho() {
		carrinho.limparCarrinho();
	}
	
	@Test
	public void testValorCompra() {
		carrinho.adicionaProduto(t1, 1);
		carrinho.adicionaProduto(t2, 2);
		assertEquals(0.00, carrinho.valorCompra(), 180.00);
	}

	@Test
	public void testRemoveProduto() {
		carrinho.adicionaProduto(t1, 1);
		carrinho.adicionaProduto(t2, 2);
		carrinho.adicionaProduto(t3, 3);
		carrinho.removeProduto(t2, 1);
		carrinho.removeProduto(t3, 2);
		assertEquals(0.00, carrinho.valorCompra(), 160.00);
	}
}

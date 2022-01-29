import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto t1;
	Produto t2;
	Produto t3;
	
	@Before
	public void Before() {
		t1 = new ProdutoComTamanho("Arroz Neuman", 00701, 40.00, 25);
		t2 = new ProdutoComTamanho("Feijão Turing", 00702, 70.00, 7);
		t3 = new ProdutoComTamanho("Batata Hopper", 00703, 50.00, 12);
	}
		
	@Test
	public void testProdutosIguais() {
		assertEquals(false, t2.equals(t3));
	}
	
	@Test
	public void testProdutosDiferentesCodigosIguais() {
		assertEquals(false, t1.equals(t3));
	}
	
	@Test
	public void testProdutosDiferentes() {
		assertEquals(false, t1.equals(t2));
	}
	
}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho t1;
	ProdutoComTamanho t2;
	ProdutoComTamanho t3;
	ProdutoComTamanho t4;
	ProdutoComTamanho t5;
	
	@Before
	public void Before() {
		t1 = new ProdutoComTamanho("Arroz Neuman", 00701, 40.00, 25);
		t2 = new ProdutoComTamanho("Feijão Turing", 00702, 70.00, 7);
		t3 = new ProdutoComTamanho("Batata Hopper", 00703, 50.00, 12);
		t4 = new ProdutoComTamanho("Arroz Neuman", 00701, 40.00, 25);
		t5 = new ProdutoComTamanho("Feijão SunSoft", 00702, 60.00, 5);
	}
	
	@Test
	public void testProdutosIguais() {
		assertEquals(true, t1.equals(t4));
	}

	@Test
	public void testProdutosDiferentesCodigosIguais() {
		assertEquals(false, t2.equals(t5));
	}
	
	@Test
	public void testProdutosDiferentesCodigosIguaisTamanhosDiferentes() {
		assertEquals(false, t2.equals(t5));
	}
	
	@Test
	public void testProdutosDiferentes() {
		assertEquals(false, t3.equals(t4));
	}
}

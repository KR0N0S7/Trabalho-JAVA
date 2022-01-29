import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testes {
	
	private static Autoridade[] vetorAutoridade = new Autoridade[6];

	@Before
	public void inicializaInstancias() {
		vetorAutoridade[0] = new Autoridade("John", "Neumann", true, "Von");
		vetorAutoridade[1] = new Autoridade("Grace", "Hopper", false, "Informal");
		vetorAutoridade[2] = new Autoridade("Katherine", "Johnson", false, "Respeitoso");
		vetorAutoridade[3] = new Autoridade("Susan", "Wojcicki", false, "Dra");
	}
	
	@Test
	public void Informal() {
		assertTrue("Erro: Informal option true", vetorAutoridade[0].getTratamento().equals("Von John Neumann"));
	}
	
	@Test
	public void Respeitoso() {
		assertFalse("Erro: Respeitoso option false", vetorAutoridade[2].getTratamento().equals("Katherine"));
	}

	@Test
	public void Titulo() {
		assertTrue("Erro: ComTitulo option false", vetorAutoridade[3].getTratamento().equals("Dra Susan Wojcicki"));
	}
	
}

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void testSalario1() {
		Funcionario user = new Funcionario();
		CalculadorSalario calc = new CalculadorSalario();
		user.funcao = "tecnico";
		user.horasTrabalhadas = 7;
		assertEquals(74.9, calc.getTotal(user),0.00);
	}

	@Test
	public void testSalario2() {
		Funcionario user = new Funcionario();
		CalculadorSalario calc = new CalculadorSalario();
		user.funcao = "engenheiro";
		user.horasTrabalhadas = 7;
		assertEquals(123.9, calc.getTotal(user),0.00);
	}
	
	@Test
	public void testSalario3() {
		Funcionario user = new Funcionario();
		CalculadorSalario calc = new CalculadorSalario();
		user.funcao = "analista";
		user.horasTrabalhadas = 7;
		assertEquals(123.9, calc.getTotal(user),0.00);
	}
	
	@Test
	public void testSalario4() {
		Funcionario user = new Funcionario();
		CalculadorSalario calc = new CalculadorSalario();
		user.funcao = "estagiario";
		user.horasTrabalhadas = 0;
		assertEquals(0, calc.getTotal(user),0.00);
	}
	
	@Test
	public void testSalario5() {
		Funcionario user = new Funcionario();
		CalculadorSalario calc = new CalculadorSalario();
		user.funcao = "projetista";
		user.horasTrabalhadas = 7;
		assertEquals(25.9, calc.getTotal(user),0.00);
	}
}


public class CalculadorSalario {
	
	double salario;


	public CalculadorSalario() {
		this.salario = 0;
	}
	
	public double getTotal(Funcionario user) {
		salario = user.horasTrabalhadas * user.getValorHora();
		salario = Math.round(salario*100);
		salario = salario/100;
		return salario;
	}
}

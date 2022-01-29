
public class Funcionario {
	String nome;
	String funcao;
	int CPF;
	double valorHora;
	double horasTrabalhadas;

	
	public Funcionario() {
		this.nome = "";
		this.funcao = "";
		this.CPF = 0;
		this.horasTrabalhadas = 0;
	}
		
	public double getValorHora() {
		switch(funcao.toLowerCase()) {
			case "tecnico":
				valorHora = 10.7;
				break;
			case "engenheiro":
				valorHora = 17.7;
				break;
			case "analista":
				valorHora = 17.7;
				break;
			case "estagiario":
				valorHora = 7.7;
				break;
			default:
				valorHora = 3.7;
				break;
		}
		return valorHora;
	}
}

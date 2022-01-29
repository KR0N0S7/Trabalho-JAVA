
public class Produto {
	String nome;
	int codigo;
	double preco;
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = 0;
		this.preco = 0;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	@Override
	public int hashCode() {
		return this.codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto outro = (Produto) obj;
		if (codigo != outro.codigo)
			return false;
		return true;
	}
}

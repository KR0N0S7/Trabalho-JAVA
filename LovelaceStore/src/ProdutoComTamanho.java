
public class ProdutoComTamanho extends Produto{
	private int tamanho;
	
	char tamanhoRoupa;
	int numeracaoCalcado;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	public int getCodigo() {
		return super.getCodigo();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + tamanho;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho outro = (ProdutoComTamanho) obj;
		if (tamanho != outro.tamanho && getCodigo() == outro.getCodigo())
			return false;
		return true;
	}
}

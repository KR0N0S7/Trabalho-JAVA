
public class Autoridade {
	String nome;
	String sobrenome;
	boolean option;
	String tratamento;
	FormatadorNome naming;
	
	public Autoridade(String nome, String sobrenome, boolean option, String tratamento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.option = option;
		this.tratamento = tratamento;
	}
	
	public String getTratamento() {
		switch(tratamento.toLowerCase()) {
			case "informal":
				naming = new Informal();
				break;
			case "respeitoso":
				naming = new Respeitoso(this.option);
				break;
			default:
				naming = new ComTitulo(tratamento);
				break;
		}
		return naming.formatarNome(this.nome,this.sobrenome);
	}
}

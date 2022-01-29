
public class Respeitoso implements FormatadorNome {
	boolean option;
	
	public Respeitoso(boolean option) {
		super();
		this.option = option;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(option) {
			return "Sr. " + nome + " " + sobrenome;
		} else {
			return "Sra. " + nome + " " + sobrenome;
		}
	}
}

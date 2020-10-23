package orientaca_objetos.passo_a_passo;

public class Pessoa {
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeParametro) {
		this.nome = nomeParametro;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idadeParametro) {
		this.idade = idadeParametro;
	}
	private String nome;
	private int idade;

}

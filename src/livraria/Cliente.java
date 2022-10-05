package livraria;

public class Cliente {

	private String nome;
	private Integer cpf;
	private String endereco;
	private Integer RG;

	public void exibirCadastro() {

	}

	public Integer exibircpf() {
		return 0;
	}

	public boolean maiorIdade(int idade) {
		if (idade > 18) {
			return true;
		}
		return false;
	}

}

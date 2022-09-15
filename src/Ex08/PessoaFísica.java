package Ex08;

public class PessoaFísica extends Pessoa implements IPessoa {

	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFísica() {
		
	}

	@Override
	public String verNome() {
		return null;
	}

}
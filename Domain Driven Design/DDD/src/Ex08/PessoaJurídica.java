package Ex08;

public class PessoaJurídica extends Pessoa implements IPessoa {
	
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public PessoaJurídica() {
		
	}

	@Override
	public String verNome() {
		return null;
	}

}
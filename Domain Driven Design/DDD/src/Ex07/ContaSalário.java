package Ex07;

public class ContaSalário extends Conta implements IConta {

	
	private int cnpjEmpregador;

	public int getCnpjEmpregador() {
		return cnpjEmpregador;
	}

	public void setCnpjEmpregador(int cnpjEmpregador) {
		this.cnpjEmpregador = cnpjEmpregador;
	}
	
	
	public ContaSalário() {
		
	}

	@Override
	public void depositar(double valor) {
		
			
	}
		
}
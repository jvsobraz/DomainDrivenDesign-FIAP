package Ex07;

public class ContaPoupança extends Conta implements IConta {

    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupança(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupança() {
    }

	@Override
	public void depositar(double valor) {
		
	}
}
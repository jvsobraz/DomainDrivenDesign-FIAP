package Ex09;

import formas.Quadrilátero;

public class Retângulo extends Quadrilátero {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Retângulo() {

	}

	public Retângulo(double base, double altura) {

		this.base = base;
		this.altura = altura;

	}

}
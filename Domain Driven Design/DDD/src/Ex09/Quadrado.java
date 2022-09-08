package Ex09;

import formas.FormasGeométricas;
import formas.Quadrilátero;

public class Quadrado extends Quadrilátero implements FormasGeométricas {

	private double lado;
	private double area;
	private double perimetro;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return this.perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Quadrado() {

	}

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularRetânguloÁrea(double base, double altura) {
		return base * altura;
	}

	@Override
	public double calcularCírculoÁrea(double raio) {
		double area = 3.14 * (raio * raio);
		return area;
	}

	@Override
	public double calcularCírculoPerímetro(double raio) {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}

	@Override
	public double calcularTriânguloÁrea(double altura, double base, double lado1, double lado2) {
		double area = (base * altura) / 2;
		return area;
	}

	@Override
	public double calcularTriânguloPerímetro(double base, double lado1, double lado2) {
		double perimetro = base + lado1 + lado2;
		return perimetro;
	}

	@Override
	public double calcularQuadriláteroPerímetro(double lado1, double lado2, double lado3, double lado4) {
		double perimetro = lado1 + lado2 + lado3 + lado4;
		return perimetro;

	}

}
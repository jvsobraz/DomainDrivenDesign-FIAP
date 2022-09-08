package Ex09;

import formas.FormasGeométricas;

public class Círculo implements FormasGeométricas {

	private int id;
	private double raio;
	private double circunferencia;
	private double area;

	public Círculo(int id, double raio, double circunferencia, double area) {
		this.id = id;
		this.raio = raio;
		this.circunferencia = circunferencia;
		this.area = area;
	}

	public Círculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return this.circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
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

	@Override
	public double calcularRetânguloPerímetro(double base, double altura) {
		return 0;
	}

}

package Ex09;

public interface FormasGeométricas {

	double calcularRetânguloÁrea(double base, double altura);

	double calculaQuadriláteroPerímetro(double lado1, double lado2, double lado3, double lado4);

	double calculaRetânguloPerímetro(double base, double altura);

	double calcularCirculoÁrea(double raio);

	double calcularCirculoPerímetro(double raio);

	double calculaTrianguloÁrea(double altura, double base, double lado1, double lado2);

	double calculaTrianguloPerímetro(double base, double lado1, double lado2);

}
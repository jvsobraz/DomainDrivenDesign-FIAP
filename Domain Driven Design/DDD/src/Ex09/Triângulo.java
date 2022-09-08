package Ex09;

import formas.FormasGeometricas;

public class Triângulo implements FormasGeométricas {

    private int id;
    private double base;
    private double altura;
    private double lado;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;

    public Triângulo() {
    }

    public Triângulo(double base, double altura, double lado, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
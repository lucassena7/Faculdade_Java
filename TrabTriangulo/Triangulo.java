package br.edu.faeterj;

public class Triangulo {
	private Ponto p1;
	private Ponto p2;
	private Ponto p3;

	public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
		if (!TrianguloValido(p1, p2, p3)) {
            throw new IllegalArgumentException("Pontos inválidos para formar um triângulo."); //Se os pontos não formam um triângulo válido, é lançada uma exceção.
        }
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Ponto getP1() {
		return p1;
	}

	public Ponto getP2() {
		return p2;
	}

	public Ponto getP3() {
		return p3;
	}

	public void setP1 (Ponto p1) {
		if (!TrianguloValido(p1, this.p2, this.p3)) {
            throw new IllegalArgumentException("Pontos inválidos para formar um triângulo."); //Se os pontos não formam um triângulo válido, é lançada uma exceção.
        }
		this.p1 = p1;
	}

	public void setP2 (Ponto p2) {
		if (!TrianguloValido(this.p1, p2, this.p3)) {
            throw new IllegalArgumentException("Pontos inválidos para formar um triângulo."); //Se os pontos não formam um triângulo válido, é lançada uma exceção.
        }
		this.p2 = p2;
	}

	public void setP3(Ponto p3) {
		if (!TrianguloValido(this.p1, this.p2, p3)) {
            throw new IllegalArgumentException("Pontos inválidos para formar um triângulo."); //Se os pontos não formam um triângulo válido, é lançada uma exceção.
        }
		this.p3 = p3;
	}
	
	private boolean TrianguloValido(Ponto p1, Ponto p2, Ponto p3) {
        double lado1 = p1.distanciaAte(p2);
        double lado2 = p2.distanciaAte(p3);
        double lado3 = p3.distanciaAte(p1);
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

	public double calcularPerimetro() {
        double lado1 = p1.distanciaAte(p2);
        double lado2 = p2.distanciaAte(p3);
        double lado3 = p3.distanciaAte(p1);
        return lado1 + lado2 + lado3;
    }
}

package br.edu.faeterj;

public class Ponto {
	
	private int x, y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanciaAte(Ponto outroPonto) {
        double distanciaX = this.x - outroPonto.getX();
        double distanciaY = this.y - outroPonto.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
}

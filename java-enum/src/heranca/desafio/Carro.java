package heranca.desafio;

public class Carro {
	final int 	VELOCIDADE_MAXIMA;
	protected int velocidadeInicial;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public int acelerar() {
		return velocidadeInicial += delta;

	}

	void frear() {
		if (velocidadeInicial >= 5) {
			velocidadeInicial -= 5;
		} else {
			velocidadeInicial = 0;

		}

	}
	
	public String toString() {
		return "Velocidade atual " + velocidadeInicial + "km/h " ;
	}

}

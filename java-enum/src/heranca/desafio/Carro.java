package heranca.desafio;

public class Carro {
	final int 	VELOCIDADE_MAXIMA;
	protected int velocidadeInicial;
	protected int delta = 5;
	

	
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

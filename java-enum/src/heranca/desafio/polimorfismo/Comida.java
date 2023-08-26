package heranca.desafio.polimorfismo;

public abstract class Comida {
	
	private double peso;

	Comida(Double peso){
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if( peso >= 0) {
			this.peso = peso;
		}
	}

	

	

	
	

}

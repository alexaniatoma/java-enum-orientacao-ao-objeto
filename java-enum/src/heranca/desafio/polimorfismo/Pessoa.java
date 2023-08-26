package heranca.desafio.polimorfismo;

public class Pessoa {
	
 private double peso;
	
	Pessoa(Double peso){
		this.peso = peso;
		
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
	@Override
	public String toString() {
		return String.format("O peso é: %.3f Kg", peso);
	}
}

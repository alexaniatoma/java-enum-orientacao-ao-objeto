package heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	//public  int acelerar() {
		
		//return velocidadeInicial += 15;

		//}

	@Override
	public int ligarTurbo() {
		return velocidadeInicial += 35;
		
	}

	@Override
	public int desligarTurbo() {
		return velocidadeInicial += 15;
		
	}

	
		
	}


	
	



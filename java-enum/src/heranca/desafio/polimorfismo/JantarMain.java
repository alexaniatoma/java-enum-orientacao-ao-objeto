package heranca.desafio.polimorfismo;

public class JantarMain {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(59.0);
		
		Arroz arroz = new Arroz(0.1);
		
		pessoa.comer(arroz);
		
		Feijao feijao = new Feijao(0.2);
		
		pessoa.comer(feijao);

		Sorvete sorvete = new Sorvete(0.1);
		
		pessoa.comer(sorvete);
		
		Comida caldeirada = new Arroz(0.3);
		pessoa.comer(caldeirada);
		
		
		System.out.println(pessoa);
		
	}

}

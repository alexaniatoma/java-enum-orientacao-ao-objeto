package heranca.desafio.abstrato;

public class MainAbstrato {
	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro();
		
		System.out.println(cachorro.mover());
		
		Mamifero filhoteCachorro = new Cachorro();
		System.out.println(filhoteCachorro.mamar());
		System.out.println(filhoteCachorro.respirar());

		
	}
	
	
}

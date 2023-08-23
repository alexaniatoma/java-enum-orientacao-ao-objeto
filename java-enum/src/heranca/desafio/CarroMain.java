package heranca.desafio;

public class CarroMain {
	public static void main(String[] args) {
		
		Carro c1 = new Civic(320);
	
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println("Civic " + c1);
		
		Ferrari f1 = new Ferrari(400);
		f1.acelerar();
		f1.frear();
		
		System.out.println("Ferrari " + f1);
		
		
	}
	
	
	


}

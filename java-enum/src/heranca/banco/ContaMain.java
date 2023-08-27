package heranca.banco;

public class ContaMain {
	public static void main(String[] args) {
		
		Conta x = new Conta(1020, "Alex" , 1000.0);
		
		Conta y = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		
		x.sacar(50.0);
		y.sacar(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
		
		
		
		
		
		
	}
	

}

package heranca.banco;

public class ContaMain {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "Alexania", 1000.0);
		
		conta.sacar(200.00);
		System.out.println(conta.getSaldo());
		
		Conta acc2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		acc2.sacar(200.00);
		System.out.println(acc2.getSaldo());
		
		
		Conta acc3 = new ContaSalario(1003, "Leo", 1000.0, 500.0);
		acc3.sacar(200.0);
		System.out.println(acc3.getSaldo());
		
		
	}
	

}

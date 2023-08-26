package heranca.banco;

public class Conta {
	
	private Integer numero;
	private String titular;
	protected double saldo;
	
	Conta() {
		
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void depositar(Double conta) {
		saldo += conta;
	}

	public void sacar(double conta) {
		saldo -= conta + 5.0;
	}

}

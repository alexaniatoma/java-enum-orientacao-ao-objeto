package heranca.banco;

public class ContaSalario extends Conta{
	
	private double limiteEmprestimo;
	
	public ContaSalario() {
		super();
		
	}

	public ContaSalario(Integer numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}


	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void limite(double conta) {
		if(conta <= limiteEmprestimo) {
			saldo += conta - 10;
		}
	}
	
	@Override
	public void sacar(double conta) {
		super.sacar(conta);
		saldo -=  2.0;
	}

}

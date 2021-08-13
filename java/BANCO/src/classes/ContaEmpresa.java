package classes;

public class ContaEmpresa extends ContaAbstract {
	
	//(+) pedirEmprestimo (soma no saldo e tira do empresitmo)
	
	private double emprestimoEmpresa;

	/**
	 * @param numero
	 * @param nomeCliente
	 * @param saldo
	 * @param pedirEmprestimo
	 */
	public ContaEmpresa(int numero, String nomeCliente, double saldo, double emprestimoEmpresa) {
		super(numero, nomeCliente, saldo);
		this.emprestimoEmpresa = emprestimoEmpresa;
	} 
	
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void emprestimo (int valor) {
		//emprestimo = saldo + valor;
	}


}

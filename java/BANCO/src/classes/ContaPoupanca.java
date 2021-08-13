package classes;

public class ContaPoupanca extends ContaAbstract{
	
	private int diaAniversarioPoupanca;

	/**
	 * @param numero
	 * @param nomeCliente
	 * @param saldo
	 * @param diaAniversarioPoupanca
	 */
	public ContaPoupanca(int numero, String nomeCliente, double saldo, int diaAniversarioPoupanca) {
		super(numero, nomeCliente, saldo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	public void correcao(int diaAtual) {
		if(diaAtual == this.diaAniversarioPoupanca) {
			super.credito(super.getSaldo()*0.005);
		}
	}
	
	

}

package classes;

public abstract class ContaAbstract {

	private int numero;
	private String nomeCliente;
	private double saldo;

	public ContaAbstract(int numero, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	//public void setSaldo(double saldo) { this.saldo = saldo;}

	public void debita(double valor) {
		if (valor > saldo) {
			System.out.println("Impossivel realizar");
		} else {
			this.saldo -= valor;
		}

	}

	public void credito(double valor) {
		if (valor < 0) {
			System.out.println("Valor informado invalido");
		} else {
			this.saldo += valor;
		}

	}

}

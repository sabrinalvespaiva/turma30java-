package entidades;

public class Produto {

	// ATRIBUTOS
	private String codigo;
	private String nome;
	private double valor;
	private int estoque = 10;

	// SOBRECARGA DO CONSTRUTOR (COMO É QUE VOU USAR)(TEM O MESMO NOME DA CLASSE)
	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	// ENCAPSULAMENTO - METODO
	// PARA CHAMAR, MOSTRAR, CALCULAR
	public String getCodigo() {
		return codigo;
	}

	// PARA MEXER, ALTERAR, DAR VALOR
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	/*
	 * public void setEstoque(int estoque) { this.estoque = estoque; }
	 */

	public void incluirEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade inválida.");
		} else {
			this.estoque += quantidade;
		}
	}

	public void retirarEstoque(int quantidade) {
		this.estoque = this.estoque - quantidade;
		if (quantidade > estoque) {
			System.out.println("Quantidade indisponivel");
		} else {
			this.estoque = this.estoque - quantidade;
		}
	}

}

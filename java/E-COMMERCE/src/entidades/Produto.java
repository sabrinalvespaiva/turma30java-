package entidades;

import java.util.Scanner;

public class Produto {

	Scanner leia = new Scanner(System.in);
	// Atributos

	private String codigo;
	private String sabor;
	private double preco;
	private int estoque;
	// Construtores

	public Produto(String codigo, int estoque) {
		super();
		this.codigo = codigo;
		this.estoque = estoque;
	}

	public Produto(String codigo, String sabor, double preco, int estoque) {
		super();
		this.codigo = codigo;
		this.sabor = sabor;
		this.preco = preco;
		this.estoque = estoque;
	}

	// Encapsulamento

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	// Métodos

	public void compra(char op) {
		if (op == 'N') {
			System.out.println("Volte sempre!");
		} else if (op == 'S') {
			System.out.println("Digite o código do produto: ");
			codigo = leia.next();
		}

	}

	public boolean retirarEstoque(int quantidade) {
		if (quantidade <= 0) {
			return false;
		} else if (quantidade > this.estoque) {
			return false;
		} else {
			this.estoque -= quantidade;
			return true;
		}
	}

	public void incluiEstoque(int incremento) {
		if (incremento <= 0) {
			System.out.println("ADICIONE UM NUMERO POSITIVO");
		} else {
			this.estoque = this.estoque + incremento;
		}
	}

}
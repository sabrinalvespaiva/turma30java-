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

	public void retiraEstoque(int decremento) {
		if (decremento > this.estoque) {
			System.out.println("QUANTIDADE INDISPONÍVEL");
		} else {
			this.estoque = this.estoque - decremento;
		}
	}

	public void incluiEstoque(int incremento) {
		if (incremento <= 0) {
			System.out.println("QUANTIDADE INVÁLIDA");
		} else {
			this.estoque = this.estoque + incremento;
		}
	}

}
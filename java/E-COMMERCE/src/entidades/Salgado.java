package entidades;

public class Salgado extends Produto{
	
	// Atributos
		private String tamanho; // P, M, G
		private String produto;

		// Construtor
		public Salgado(String codigo, String sabor, double preco, int estoque, String tamanho) {
			super(codigo, sabor, preco, estoque);
			this.tamanho = tamanho;
		}
		
		

		public Salgado(String codigo, String sabor, double preco, int estoque, String tamanho, String produto) {
			super(codigo, sabor, preco, estoque);
			this.tamanho = tamanho;
			this.produto = produto;
		}



		// Encapsulamento
		public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}



		public String getProduto() {
			return produto;
		}



		public void setProduto(String produto) {
			this.produto = produto;
		}
		
		

	}

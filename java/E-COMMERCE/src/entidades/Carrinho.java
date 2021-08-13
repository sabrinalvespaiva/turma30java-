package entidades;

public class Carrinho {
	// ATRIBUTOS ------------------------------------------------------------
	private int quantidade;
	private int idProduto;
	private String nomeProduto;

	// CONSTRUTOR -----------------------------------------------------------
	public Carrinho(int quantidade, int idProduto, String nomeProduto) {
		super();
		this.quantidade = quantidade;
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
	}

	// METODOS --------------------------------------------------------------

	// Getters and Setters --------------------------------------------------
	// QUANTIDADE
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// ID PRODUTO
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	// NOME PRODUTO
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

}

package exerciciocollectionslist;

public class EstoqueClass {
	
	private String material;
	private int quantidade;
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//CONSTRUTOR
	public EstoqueClass(String material, int quantidade) {
		super();
		this.material = material;
		this.quantidade = quantidade;
	}

}

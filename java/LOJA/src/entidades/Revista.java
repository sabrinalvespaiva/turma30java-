package entidades;

public class Revista extends Produto {
	
	private String editora;

	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		//� a m�e, fez o contrutor herdando os atibutos de Produto
		super(codigo, nome, valor, estoque);
		this.editora = editora;
	}
	
	

}

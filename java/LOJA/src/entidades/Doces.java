package entidades;

public class Doces extends Produto{
	
	private String fabricante;
	
	public Doces(String codigo, String nome, double valor, int estoque, String fabricante) {
		//heran�a da classe produto 
		super(codigo, nome, valor, estoque);
		this.fabricante = fabricante;
	}
	
	

}

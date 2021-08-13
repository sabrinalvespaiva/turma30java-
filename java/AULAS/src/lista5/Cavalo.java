package lista5;

public class Cavalo extends Animal implements Sons {

	private boolean deveCorrer;

	// sobracarga do contrutor
	public Cavalo(String nome, int idade, String som, boolean eleCorre) {
		// super é a mãe, fez o contrutor herdar os atibutos de Produto
		super(nome, idade, som);
		//this é usado para variaveis declaracadas dentro da propria classe
		this.deveCorrer = eleCorre;
	}
	

	public boolean getDeveCorrer() {
		return deveCorrer;
	}



	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}



	@Override
	public void somAlto() {
		System.out.println("iiirrrrí, rilinchin (em letra maiuscula");

	}

	@Override
	public void somBaixo() {
		System.out.println("iiirrrrí, rilinchin");

	}
	
	//polimorfismo 
		@Override
		public void emiteSom() {
			System.out.println("iiirrrrí, rilinchin");	
		}

}

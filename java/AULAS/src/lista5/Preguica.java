package lista5;

public class Preguica extends Animal implements Sons{
	
private boolean subirArvore;
	
	//CONSTRUTOR 
	public Preguica(String nome, int idade, String som) {
		//super é a mãe, fez o contrutor herdar os atibutos de Produto
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}	

	public boolean getSubirArvore() {
		return subirArvore;
	}


	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}


	@Override
	public void somAlto() {
		System.out.println("GRITINHOS");
	}

	@Override
	public void somBaixo() {
		System.out.println("gritinhos");
	}
	
	//polimorfismo 
			@Override
			public void emiteSom() {
				System.out.println("emitindo som da preguiça...");	
			}
	

}

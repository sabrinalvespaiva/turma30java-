package lista5;

public class Cachorro extends Animal implements Sons{
	
	private boolean deveCorrer;
	private String raca;
	private char porte; //P M G
	
	
	//CONSTRUTOR 
	public Cachorro(String nome, int idade, String som) {
		//super é a mãe, fez o contrutor herdar os atibutos de Produto
		super(nome, idade, som);
		this.deveCorrer = deveCorrer;
		this.raca = raca;
		this.porte = porte;
		
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	//metodo da ~interface
	public void somAlto() {
		System.out.println("AU AU AU");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("au au au");
		
	}
	
	//polimorfismo 
	@Override
	public void emiteSom() {
		System.out.println("au au au");	
	}
	

}

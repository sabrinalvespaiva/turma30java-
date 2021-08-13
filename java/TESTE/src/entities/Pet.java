package entities;

public class Pet {
	
	//ATRIBUTOS: É, TEM, ESTAR 
	private String raca;
	private char porte;
	private int anoNascimento;
	
	
	/**
	 * @param raca
	 * @param porte
	 * @param anoNascimento
	 */
	public Pet(String raca, char porte, int anoNascimento) {
		super();
		this.raca = raca;
		this.porte = porte;
		this.anoNascimento = anoNascimento;
	}

	//CONSTRUTORES
	//construtor ter o mesmo nome da classe, this pq o atributo esta declaracado aqui dentro
	public Pet(String raca) {
		super();
		//this para evitar ambiguidade pra programa entender que o atributo vai entender o que foi informado na variavel (repare que as cores são diferentes)
		this.raca = raca;
	}

	//SOBRECARGA DO CONSTRUTOR
	//obs: na classe main posso usar qualquer um dos construtores
	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}

	//SE O METODO NAO É PUBLICO TEM QUE FAZER O ENCAPSULAMENTO(GETTERS E SETTERS - PROTEGE OS DADOS) PRA ACESSAR OS DADOS
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}
	
	//METODO VOID EXECUTA E ACABOU
	public void emiteSom(){

	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int idade() {
		return (2021 - anoNascimento);
		
	}
	
	


	
	

	

}

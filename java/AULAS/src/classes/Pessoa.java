package classes;

public class Pessoa {
	
	//ATRIBUTOS
	//PRIVATE SO FICA DISPONIVEL DENTRO DA CLASSE, NAO DA PRA USAR EM OUTRO PROJETO
	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome; //O, A, E
	public boolean ativo;
	
	//CONSTRUTORES 
	public Pessoa(String nome) {
		this.nome = nome;	
	}
	
	//SOBRECARGA DE CONSTRUTOR
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//SOBRECARGA DO CONSTRUTOR QUE PEGOU TODOS OS ATRIBUTOS (para gerar de forma automatica clica 
	//com o lado direito do mouse, Alt+Shift+S + generate construtor using fields 
	public Pessoa(String nome, int anoNascimento, String cpf, char pronome, boolean ativo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.pronome = pronome;
		this.ativo = ativo;
	}
	

	//depois dos atributos tudo é metodo, metodo termina em ()
	//METODOS
	public void mostrarIdade() {
		System.out.println(2021 - this.anoNascimento);
	}
	
	//ENCAPSULAMENTO OU GETTERS E SETTERS é necessario sempre que deixar o atributo private
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getPronome() {
		return pronome;
	}

	public void setPronome(char pronome) {
		this.pronome = pronome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	//NA CLASSE PRINCIPAL ESSE METODO IRA PEDIR PARA DIGITAR O ANO ATUAL
	public int calcIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	
	
	

}

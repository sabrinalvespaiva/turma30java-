package programas;

public class Aluno {
//� apenas uma classe, nao inicia o main pois nao � um programa inicial 
	
	//ATRIBUTOS (parece variavel mas nao �)
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	//CONSTRUTORES
	//ENCAPSULAMENTO - SEGURAN�A(getters e setters)
	
	//METODOS 
	public void mostraIdade() {
		System.out.println("A idade � " + (2021 - anoNascimento));
	}
	
	//SOBRECARGA DE METODO (mais do mesmo so que de uma forma diferente)
		public void mostraIdade(int anoAtual) {
			System.out.println("a idade � " + (anoAtual - anoNascimento));
		}
	
	
	
	

}

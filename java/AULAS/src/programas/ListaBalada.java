package programas;

import classes.Pessoa;

public class ListaBalada {
	//programa inicial

	public static void main(String[] args) {

		Pessoa primeiroFila = new Pessoa();
		primeiroFila.setNome("Paulo");
		primeiroFila.anoNascimento = 2000;
		
		primeiroFila.mostrarIdade();//EXIBE A IDADE POIS TEM UMA IMPRESSAO DENTRO DO METODO
		
		System.out.println("Quem � fulano? Fulano � " + primeiroFila.nome);
		System.out.println("idade " + (2021 - primeiroFila.anoNascimento)); 
		System.out.println(primeiroFila.nome+ " sua idade � " + primeiroFila.calcIdade(2021));
		
		//UTILIZANDO O METODO CONSTRUTOR(public)
		primeiroFila = new Pessoa("JP");

	}

}

package programas;

import java.util.Scanner;

public class CadAlunePoo {

	public static void main(String[] args) {

		String nome[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int notas[] = new int[nome.length];
		String matriculas[] = new String[nome.length]; //MAT-0X
		char op = 'X';
		Scanner leia = new Scanner(System.in);
		
		
		String matricula[] = new String[nome.length];
		int nota[] = new int[nome.length]; //MAT-0X
		boolean ativo[] = new boolean[39]; //começa true
		
		System.out.println("MAT\tSTATUS\tNOTA\tNOME");
		for (int x = 0; x < 39; x++) {
			nota[x] = 0;
			ativo[x] = true;
			matricula[x] = "MAT-0"+(x + 1);
			if(ativo[x] == true) {
			System.out.println(matricula[x]+ "\t" + "ATIVO" +"\t"+ nota[x] +"\t"+ nome[x]);
			} else {
				System.out.println(matricula[x]+ "\t" + "INATIVO" +"\t"+ nota[x] +"\t"+ nome[x]);
			}
			//TENARIO: funciona como um if dentro da impressao ex (ativo[x]==true?"ATIVO":"INATIVO") o mesmo que um se ativo == true, senao inativo
		}
		
		
		
	}

}

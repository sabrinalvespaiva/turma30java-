package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {

		String alunes[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length]; //MAT-0X
		boolean ativo[] = new boolean[alunes.length]; //true
		char op = 'X';
		Scanner leia = new Scanner(System.in);
		
		final int QNTD_ALUNOS=3;
		final String NOME[] = {"Rodrigo","Roseo","teste","abcd"};
		String matricula[] = new String[NOME.length];
		int nota[] = new int[NOME.length]; //MAT-0X
		boolean ativo[] = new boolean[NOME.length]; //começa true
		String matriculaDigitada="";

		
		//mostrar todo mundo
		//pedir pela matricula um aluno
		//informar a nota deste aluno
		//vai informar se o aluno ainda continua ativo ou não [o usuario nao pode digitar true ou false]
		//repetir o processo ate que a pergunta continua s\n seja n
		//apos, mostrar todos os alunos com nota pela regra
		//ate 5 - estude mais
		//acima de 5, otimo continue assim
		//aluno inativo ou aluno ativo baseado no true ou false de ativo
		//somente dos alunos que tem nota
		
		//mostrar todo mundo
		
		for(int i=0;i<NOME.length;i++) {
			matricula[i] = "MAT-0"+(i+1);
		}
		
		// Mostrar todo mundo
		for(int i=0;i<NOME.length;i++) {
			if((i % 3 == 0) && (i != 0)) {
				System.out.printf("%s\n",NOME[i]);
			} else {
				System.out.printf("%s | ",NOME[i]);
			}
		}
		//pedir pela matricula
		System.out.printf("");
		matriculaDigitada = leia.next();
		for(int i=0;i<NOME.length;i++) {
			if(matriculaDigitada == matricula[i]) {
				aluneSelecionade = i;
				break;
			}
		}
		
		//informar a nota do alune
		
		System.out.println("Digite T para alune ativo e F para alune inativo");
		op = leia.next().toUpperCase().charAt(0);
		if(op == 'T') {
			ativo[i] = true; 
			System.out.println("O alune esta ativo");
		} else if (op == 'F') {
			System.out.println("O alune esta inativo");
		}

		
		
		
		
				
		

	}

}

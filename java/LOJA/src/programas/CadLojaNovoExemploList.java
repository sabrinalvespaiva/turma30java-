package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovoExemploList {

	public static void main(String[] args) {

		List <String> cadastro = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
	
		Integer y = 0; //é uma classe de inteiros com poderes especiais, chamadas wrap class
		
		//NÃO TEM TAMANHO PRÉ DEFINIDO 
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTOS");
		
		//IMPRIME O TAMANHO DA LISTA 
		System.out.println("Tamanho da lista " + cadastro.size());
		//EMPURRA A LISTA PRA BAIXO E INCLUI GUARANI NA POSIÇÃO 1
		cadastro.add(1, "Guarani");
		
		//IMPRIME SO A POSIÇÃO QUE ESTOU PEDINDO, A 4 NO CASO
		System.out.println(cadastro.get(4));
		
		//ESSE É FOR EACH
		int x = 0;
		//X IMPRIME AS POSIÇOES DO TIME (time.toLowerCase - MUDA A STRING PARA MINUSCULO)
		for(String time: cadastro) {
			System.out.println(x + " - " + time.toLowerCase());
			x++;
		}
		
		String auxNome = " ";
		
		System.out.println("Digite o codigo do time que deseja: ");
		auxNome = leia.next().toUpperCase();
		//pega a posição e passa para x, se tivesse dois times iguais ele pega o primeiro com o nome desejado, se quiser o ultimo seria lasteIndex
		x = cadastro.indexOf(auxNome);
		//x = leia.nextInt();
		System.out.println("Vc escolheu o time " + cadastro.get(x) + " esse time sera removido");
		cadastro.remove(x);
		System.out.println("Nova lista");
		
		//inciar o x novamente por conta do for 
		x=0;
		for(String time : cadastro) {
			System.out.println(x + "-" + time);
			x++;
		}
		
		

	}

}

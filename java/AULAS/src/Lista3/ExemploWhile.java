package Lista3;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		/*precisa do nome e do salario
		//informar nome e salario de quem tem o maior salario
		//programa termina quando for digitado um valor negativo
		
		String nome = "", nomeMaiorSalario = "";
		int salario, maiorSalario = 0, contador = 1; 
		Scanner leia = new Scanner(System.in);//instanciar/criar/por no cod para uso
		
		//entradas
		while (salario > 0) { // a verificacao é feita no inicio
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;	
			}
			System.out.println("Digite o nome: ");
			nome = leia.next();
			System.out.println("Digite o salario: ");
			salario = leia.nextInt();
		}
		System.out.println();
		System.out.printf("O maior salario é %d da pessoa %s", maiorSalario, nomeMaiorSalario);
		//%d = int | %f = double | %c = char | %s = string
		
		leia.close();


	}

}

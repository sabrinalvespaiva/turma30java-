package application;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		
		/*TRY = TENTAR, é o if dos erros
		try {
			
		}catch (erro) {
			//tratar de alguma forma possiveis erros
			 * 
			 *DA PRA FAZER DE FORMA GENERICA, pega qualquer erro e exibe a msg q eu escolher
			 *try(){}
			 *catch (Exception erro){}
			 *
			 *outra forma: catch(throwable erro)
			 *System.out.print(erro.getMessage());
			 *erro.printStackTrace();
			 *
			 *EXECUTADO "DE QUALQUER FORMA"
			 *finally{System.out.print("fechando o teclado...");
			 *leia.close();
			 *
			 *COMANDO PARA SAIR 
			 *System.exit(0); (ele derruba o programa naquele momento, antes de chegar ao finally)
			
		}*/
		
		int valor;
		int valores[]= new int[4];
		
		try {
		
		System.out.println("Digite a posição dentro do vetor 0-3: ");
		valor = leia.nextInt();
		System.out.println("Digite a posição dentro do vetor 0-3: ");
		valores[valor] = leia.nextInt();
		
		System.out.printf("O valor digitado na posição %d foi %d \n",valor, valores[valor]);
		System.out.println(" ");
		System.out.println("valor da divisao teste: " + valores[valor]/valor);
		
		} catch (java.lang.ArithmeticException erro){
			System.out.println("Impossivel dividir por zero");	
		}
		
		System.out.println("Fim do programa! ");
		

	}

}

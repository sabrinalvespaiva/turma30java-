package Lista3;

import java.util.Scanner;

public class CopinhaExemplo {

	public static void main(String[] args) {

		String nomesTimes[] = new String[4];
		int pontosTimes[] = {0,0,0,0};
		nomesTimes[0] = "SANTOS";
		
		
		String time1 = "SANTOS", time2 = "SPFC", time3 = "PALMEIRAS", time4 = "CORINTHIANS";
		int ponto1 = 0, ponto2 = 0, ponto3 = 0, ponto4 = 0;
		char op ='X'; // G GANHOU + 3, P PERDEU = 0, E EMPATOU + 1
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <= 2; x++) {
			System.out.println("RODADA: " + x);
			System.out.println(time1 + " G para ganhou, P para perdeu ou E para Empate:");
			op = leia.next().toUpperCase().charAt(0);//lê a string, converte para caracter (char) e coloca em maiusculo ou le em minusculo
			if(op == 'G') {
				ponto1 += 3;	
			} else if(op == 'E') {
				ponto1 += 1;
			} else if(op == 'P') {
				ponto1 = 0;
			} else {
				System.out.println("Digitou errado, vai ficar com 0 !");
			}
		
			System.out.print(time2+" G-ganhou, P-perdeu ou E-empatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto2 += 3;
				//ponto1 = ponto1 + 3;
			}
			else if (op=='E') {
				ponto2 += 1;
			}
			else if (op=='P') {
				ponto2 += 0;
			} 
			else {
				System.out.println("Digitou errado,  vai fica com 0 !!!");
			}
			System.out.print(time3+" G-ganhou, P-perdeu ou E-empatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto3 += 3;
				//ponto1 = ponto1 + 3;
			}
			else if (op=='E') {
				ponto3 += 1;
			}
			else if (op=='P') {
				ponto3 += 0;
			} 
			else {
				System.out.println("Digitou errado,  vai fica com 0 !!!");
			}
			System.out.print(time4+" G-ganhou, P-perdeu ou E-empatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto4 += 3;
				//ponto1 = ponto1 + 3;
			}
			else if (op=='E') {
				ponto4 += 1;
			}
			else if (op=='P') {
				ponto4 += 0;
			} 
			else {
				System.out.println("Digitou errado,  vai fica com 0 !!!");
			}


		}
		
		System.out.println();
		System.out.println("TABELA");
		System.out.printf("Time %s pontos atuais: %d ponto(s)!!\n",time1, ponto1);
        System.out.printf("Time %s pontos atuais: %d ponto(s)!!\n",time2, ponto2);
        System.out.printf("Time %s pontos atuais: %d ponto(s)!!\n",time3, ponto3);
        System.out.printf("Time %s pontos atuais: %d ponto(s)!!\n",time4, ponto4);
		

	}

}

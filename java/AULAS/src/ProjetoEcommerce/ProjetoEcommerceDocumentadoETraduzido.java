package ProjetoEcommerce;

import java.util.Scanner;

public class ProjetoEcommerceDocumentadoETraduzido {

public static void main(String[] args) {
		
		//DECLARACAO DE VARIAVEIS  
		Scanner leia = new Scanner(System.in);
		String auxCod = "Frase";
		char opcao = 'V';
		double icms = 0.0, descontoAVista = 0.0, pagamentoCartao = 0.0, pagamentoParcelado = 0.0, total = 0.0,totalCarrinho = 0.0;
		int quantidade = 0, op = 0, contador = 0;
		String produtoCarrinho[] = new String[10];
		double quantidadeCarrinho[] = new double[10];

		String codigo[] = new String[10];
		String produto[] = new String[10];
		int estoque[] = new int[10];
		double valor[] = new double[10];

		//ATRIBUIÇÃO DE VALORES AOS VETORES
		codigo[0] = "G5-1";
		produto[0] = "RODO DE PIA    ";
		valor[0] = 20.00;
		estoque[0] = 10;
		codigo[1] = "G5-2";
		produto[1] = "VASSOURA       ";
		valor[1] = 10.00;
		estoque[1] = 10;
		codigo[2] = "G5-3";
		produto[2] = "ROBÔ ASPIRADOR";
		valor[2] = 250.00;
		estoque[2] = 10;
		codigo[3] = "G5-4";
		produto[3] = "ASPIRADOR DE PÓ";
		valor[3] = 150.00;
		estoque[3] = 10;
		codigo[4] = "G5-5";
		produto[4] = "LIXEIRA         ";
		valor[4] = 15.00;
		estoque[4] = 10;
		codigo[5] = "G5-6";
		produto[5] = "RODO MAGICO     ";
		valor[5] = 55.00;
		estoque[5] = 10;
		codigo[6] = "G5-7";
		produto[6] = "PÁ DE LIXO     ";
		valor[6] = 5.00;
		estoque[6] = 10;
		codigo[7] = "G5-8";
		produto[7] = "TAPETE DE PIA    ";
		valor[7] = 22.00;
		estoque[7] = 10;
		codigo[8] = "G5-9";
		produto[8] = "SACOLA DE LIXO";
		valor[8] = 12.00;
		estoque[8] = 10;
		codigo[9] = "G5-10";
		produto[9] = "ESFREGÃO         ";
		valor[9] = 18.00;
		estoque[9] = 10;

		//ENTRADAS
		System.out.println("Deseja fazer compras? S/N: ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		//CABEÇALHO
		if (opcao == 'S') {
			System.out.println("LIMPAJÁ");
			System.out.println("Cuidando do seu lar");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			System.out.println("COD\t\tPRODUTO\t\t\t\t\t\tVALOR R$\t\tESTOQUE");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
			//FOR TEM A FUNÇÃO DE VARRER OS VETORES PARA EXIBIR O CATALOGO
			for (int x = 0; x < 10; x++) {
				System.out.printf("%s \t\t %s \t\t\t\t %.1f \t\t\t %d \n", codigo[x], produto[x], valor[x],
						estoque[x]);
			}

			//CONDIÇÃO PARA RODAR O PRAGRAMA ENQUANTO O CLIENTE QUISER COMPRAR
			System.out.println("Deseja comprar? (V) ou Finalizar compra(F): ");
			opcao = leia.next().toUpperCase().charAt(0);

			while (opcao == 'V') {

				System.out.println("SELECIONE O CODIGO DO PRODUTO: ");
				auxCod = leia.next().toUpperCase();

				System.out.println("INFORME QUANTAS UNIDADES: ");
				quantidade = leia.nextInt();

				//PROCESSAMENTOS 
				for (int x = 0; x < 10; x++) {
					if (auxCod.equals(codigo[x])) {
						if (quantidade <= estoque[x] && quantidade > 0) { //VALIDAÇÃO DE ESTOQUE 

							total = valor[x] * quantidade; //CALCULA O VALOR DO PEDIDO SEM ICMS E SEM OS ADICIONAIS DE PAGAMENTO 
							totalCarrinho += total;
							estoque[x] = estoque[x] - quantidade; //ATUALIZAÇÃO DE ESTOQUE 
							icms = (totalCarrinho) * 0.09; //CALCULO DO ICMS
							quantidadeCarrinho[contador] = quantidade;//ADICIONANDO A QUANTIDADE AO V5ETOR DE QUANTIDADE
							produtoCarrinho[contador] = produto[x]; //ADICIONANDO O PRODUTO AO VETOR DE PRODUTO
							contador++; //MANTEM OS INDICES DE QUANTIDADECARRINHO E PRODUTOCARRINHO ATUALIZADOS

							//EXIBIÇÃO DO PRODUTO SELECIONADO 
							System.out.println(codigo[x] + "\t" + produto[x] + "\t Unidades " + quantidade + "\t Valor total " + (total));

							//VERIFICAÇÃO DE CONTINUIDADE OU ENCERRAMENTO DE COMPRA, CASO A RESPOSTA SEJA V O LOOP SE REPETE A PARTIR DA LINHA 84 
							System.out.println("Deseja continuar comprando?(V) ou Prosseguir para opções de pagamento?(F): ");
							opcao = leia.next().toUpperCase().charAt(0);

							if (opcao == 'V') {
								System.out.println(
										"----------------------------------------------------------------------------------------------------------");
								System.out.println("COD\t\tPRODUTO\t\t\t\t\t\tVALOR R$\t\tESTOQUE");
								System.out.println(
										"----------------------------------------------------------------------------------------------------------");

								for (x = 0; x < 10; x++) {
									System.out.printf("%s \t\t %s \t\t\t\t %.1f \t\t\t %d \n", codigo[x],
											produto[x], valor[x], estoque[x]);
								}
							}
							if (opcao == 'F') {
								System.out.println(
										"Escolha a forma de pagamento:\n 1: A vista (10% de desconto)\n 2: Cartao com acrescimo de 10%\n 3: 2 parcelas (acrescimo de 15%) \n");
								op = leia.nextInt();

								System.out.println(
										"----------------------------------------------------------------------------------------------------------");
								System.out.println("NOTA FISCAL\t LIMPAJÁ\n");
								System.out.println("ICMS DE 9% CALCULADO SOBRE O VALOR TOTAL DA COMPRA!");

								//SUBTRAI UM DO CONTADOR PARA EXIBIR OS PRODUTOS E UNIDADES NA POSIÇÃO DO CONTADOR NA NOTA FISCAL
								for (int i = contador - 1; i >= 0; i--) {
									System.out.println(produtoCarrinho[i] + " Unidades: " + quantidadeCarrinho[i]);
								}

								//ENCERRAMENTO DA COMPRA E OPÇOES DE PAGAMENTO
								
								switch (op) {
								case 1:
									descontoAVista = totalCarrinho * 0.10;
									System.out.println("Valor total da compra: " + (totalCarrinho + icms - descontoAVista));
									break;
								case 2:
									pagamentoCartao = totalCarrinho * 0.10;
									System.out.println("Valor total da compra: " + (totalCarrinho + icms + pagamentoCartao));
									break;
								case 3:
									pagamentoParcelado = totalCarrinho * 0.15;
									System.out.println("Valor total da compra: " + (totalCarrinho + icms + pagamentoParcelado));
									System.out.println("Valor das parcSelas: " + ((totalCarrinho + icms + pagamentoParcelado) / 2.00));
									break;
								}
								break;
							}

						} else {
							System.out.println(
									"----------------------------------------------------------------------------------------------------------");
							System.out.println("COD\\t\\tPRODUTO\\t\\t\\t\\tVALOR R$\\t\\tESTOQUE");
							System.out.println(
									"----------------------------------------------------------------------------------------------------------");

							//VALIDAÇÃO DE ESTOQUE PARA INFORMAR AO CLIENTE SE O PEDIDO PODE SER REALIZADO 
							for (x = 0; x < 10; x++) {
								System.out.printf("%s\t\t%s\t\t\t %.1f\t\t %d\n", codigo[x], produto[x],
										valor[x], estoque[x]);
							}
							System.out.println("Quantidade indisponivel!");
							System.out.println("Por favor, insira o codigo novamente com uma quantidade válida.");
						}

					} else if (x == 9) {
						System.out.println("Por favor, insira um código valido.");
					}

				}

			}
			System.out.println("COMPRA FINALIZADA, OBRIGADA POR COMPRAR CONOSCO!");
			
			//CASO O CLIENTE INFORME QUE NAO DESEJA COMPRAR
		} else if (opcao == 'N') {
			System.out.println("Volte sempre!!");
			//CASO O CLIENTE DIGITE UM CARACTER USADO
		} else {
			System.out.println("Opcao invalida!");
		}
	}

}

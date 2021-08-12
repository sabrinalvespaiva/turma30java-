package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Aparencia;
import entidades.Pizza;
import entidades.Produto;
import entidades.Salgado;

public class Loja {

	public static void main(String[] args) {

		// Atributos
				Scanner leia = new Scanner(System.in);
				char op = 'S';
				char op1;
				char op2;
				char op3;
				String auxCod = " ";
				int pos, quantidade;

				// Listas: armazenam os catálogos de pizzas e salgados e criam carrinho
				List<Produto> carrinho = new ArrayList<>();
				List<Produto> cardapioPizza = new ArrayList<>();
				List<Produto> cardapioSalgado = new ArrayList<>();
				List<Produto> comidas = new ArrayList<>();

				// Cardápio de Pizzas
				comidas.add(new Produto("G5-1", "Mussarela ", 43.00, 10));
				comidas.add(new Produto("G5-2", "Calabresa ", 39.00, 10));
				comidas.add(new Produto("G5-3", "Portuguesa", 45.00, 10));
				comidas.add(new Produto("G5-4", "Frango    ", 39.00, 10));
				comidas.add(new Produto("G5-5", "Milana    ", 46.00, 10));

				// Cardápio de Salgados
				comidas.add(new Produto("G5-6", "Coxinha   ", 5.00, 10));
				comidas.add(new Produto("G5-7", "Pão Pizza ", 5.00, 10));
				comidas.add(new Produto("G5-8", "Pastel    ", 5.00, 10));
				comidas.add(new Produto("G5-9", "Presunto/Q", 5.00, 10));
				comidas.add(new Produto("G5-10", "Salsicha ", 5.00, 10));

				// A fazer: Mostrar todo o catálogo de produtos

				// Início do Programa

				System.out.println("Você deseja comprar? [S/N]");
				op3 = leia.next().toUpperCase().charAt(0);
				int i = 0;
				// Processamentos
				do {
					pos= -1;
					// Escolha: Pizza ou Salgado
					Aparencia.pizzaSalgado();
					op2 = leia.next().toUpperCase().charAt(0);

					// Caso a escolha seja Pizza
					if (op2 == 'P') {

						// Imprime catálogo de Pizzas
						Aparencia.mostraTLoja();
						for (Produto menu : comidas) {
							System.out.println(menu.getCodigo() + "\t\t" + menu.getSabor() + "\t\t" + menu.getPreco() + "\t\t"
									+ menu.getEstoque());
						}
						// Caso a escolha seja Salgado
					} else if (op2 == 'S') {

						// Imprime catálogo de Salgados
						Aparencia.mostraTLoja();
						for (Produto menu : comidas) {
							System.out.println(menu.getCodigo() + "\t\t" + menu.getSabor() + "\t\t" + menu.getPreco() + "\t\t"
									+ menu.getEstoque());
						}
					}
		//---------------------------------------------------------------------------------------------
					// ^^CODIGO BOM

					System.out.println("SELECIONE O CODIGO DO PRODUTO: ");
					auxCod = leia.next().toUpperCase();

					for (int x=0; x<comidas.size(); x++ ) {
		                
		                if (comidas.get(x).getCodigo().equals(auxCod)) {
		                    pos = x;
		                    break;
		                }
		                
		            }

					
					if (pos>=0) {
		                System.out.println("Produto escolhido: ");
		                System.out.println("COD\tVALOR\tESTOQUE\tPRODUTO");
		                System.out.printf("%s\t%.2f\t%d\t%s\n",comidas.get(pos).getCodigo(),comidas.get(pos).getPreco(),comidas.get(pos).getEstoque(),comidas.get(pos).getSabor());
		                System.out.println("Informe quantos tu vai querer :");
		                int auxQtde = leia.nextInt();
		                
		                if (auxQtde< 0) {
		                    System.out.println("Impossivel realizar, valor negativo!!! Ae não né!!!");
		                }
		                else if (auxQtde==0) {
		                    System.out.println("Impossivel realizar, quantidade zero. Tá dificil!");
		                }
		                else if (comidas.get(pos).getEstoque()==0){
		                    System.out.println("Impossivel realizar, produto sem estoque!!!");
		                }
		                else if (comidas.get(pos).getEstoque()< auxQtde) {
		                    System.out.print("Impossivel realizar, quantidade maior que estoque!!");
		                } else {
		                	comidas.add(new Produto(comidas.get(pos).getCodigo(),comidas.get(pos).getSabor(),comidas.get(pos).getPreco(),auxQtde));
		                }
		            }
		            else {
		                System.out.println("Codigo informado não existe!!!");
		            }
		            System.out.println("Continua S-sim ou N-nao :");
		            op = leia.next().toUpperCase().charAt(0);
		            //fechamento do carrinho - não ta pronto
		            //System.out.println("vc vai pagar : R$"+(auxQtde*lista.get(pos).getValor()));
		            //lista.get(pos).retiraEstoque(auxQtde);
		        } while (op=='S');
		        System.out.println("FECHAMENTO DA COMPRA");
		        System.out.println("COD\tVALOR\tESTOQUE\tPRODUTO");
		        double auxTotal=0;
		        for (Produto escolhido : carrinho) {
		                for (int x=0; x<comidas.size(); x++ ) {
		                    
		                    if (carrinho.get(x).getCodigo().equals(escolhido.getCodigo())) {
		                        pos = x;
		                        break;
		                    }
		                    
		                }
		            
		            System.out.println(escolhido.getCodigo()+"\t"+escolhido.getPreco()+"\t"+escolhido.getEstoque()+"\t"+escolhido.getSabor());
		            auxTotal = auxTotal + (escolhido.getPreco()*escolhido.getEstoque());
		            carrinho.get(pos).retiraEstoque(escolhido.getEstoque());
		        }
		        System.out.println("FECHAMENTO R$: "+auxTotal);
		        carrinho.clear();
		        
		        System.out.println("LISTA ATUAL");
		        System.out.println("COD\tVALOR\tESTOQUE\tPRODUTO");
		        for (Produto item : comidas) {
		            
		            System.out.println(item.getCodigo()+"\t"+item.getPreco()+"\t"+item.getEstoque()+"\t"+item.getSabor());
		        }
		        System.out.println("ATÉ BREVE!!!");
		    }

		}
//					
//					System.out.println("INFORME QUANTAS UNIDADES: ");
//					quantidade = leia.nextInt();
		//
//					/*
//					 * System.out.println("Digite a quantidade desejada: "); int quantidade =
//					 * leia.nextInt(); if (){
//					 * System.out.println("Digite o tamanho desejado: [M/G]"); } else {
//					 * System.out.println("Digite o tamanho desejado: [P/M/G]"); }
//					 */
//					if (i > 1) {
		//
//						System.out.println("Comprar mais? [S/N]");
//						op = leia.next().toUpperCase().charAt(0);
		//
//					}
//					i++;
//				} while (op == 'S');
		//
//			}
		//
		//}

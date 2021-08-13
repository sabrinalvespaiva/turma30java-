package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Carrinho;
import entidades.Produto;

public class Loja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); // SCANNER
		// ------------ VARIAVEIS DA COMPRA
		int checarEstoque = 0, numeroPedido = 0, qntdDigitada = 0, produtoEscolhido = 0, qntdTotal = 0;
		char comprarSN = 'S', opcaoPagamento = ' ', continuarCompra = 'S', tamanho = 'G';
		boolean checarCodigo = false, checarQntd = false;
		double total = 0.0, auxTotal = 0.0, parcela = 0.0, pagamento = 0.0;
		String codigoDigitado = "", nomeCliente = "";

		// Listas: armazenam os catálogos de pizzas e salgados e criam carrinho
		List<Carrinho> carrinho = new ArrayList<>(); // CARRINHO
		List<Produto> produtos = new ArrayList<>();

		// CARDAPIO
		produtos.add(new Produto("G5-1", "Pizza de Mussarela ", 28.00, 10));
		produtos.add(new Produto("G5-2", "Pizza de Calabresa ", 28.00, 10));
		produtos.add(new Produto("G5-3", "Pizza de Portuguesa", 30.00, 10));
		produtos.add(new Produto("G5-4", "Pizza de Frango/Cat", 30.00, 10));
		produtos.add(new Produto("G5-5", "Pizza de Milana    ", 33.00, 10));
		produtos.add(new Produto("G5-6", "Salgado  Coxinha   ", 3.00, 10));
		produtos.add(new Produto("G5-7", "Salgado  Pão Pizza ", 3.00, 10));
		produtos.add(new Produto("G5-8", "Salgado  Pastel    ", 3.00, 10));
		produtos.add(new Produto("G5-9", "Salgado  Presunto/Q", 3.00, 10));
		produtos.add(new Produto("G5-10", "Salgado  Salsicha ", 3.00, 10));

		// -------------------------------------- COMEÇAR COMPRA
		System.out.print("\n Deseja comprar [S/N]: ");
		comprarSN = leia.next().toUpperCase().charAt(0);
		while (comprarSN == 'S') {
			// ------------------------------------- COMEÇAR CARRINHO
			// ZERA VARIÁVEIS DE COMPRA
			carrinho.clear();
			total = 0.0;
			qntdTotal = 0;
			pagamento = 0.0;
			parcela = 0.0;
			continuarCompra = 'S';
			nomeCliente = "";

			// CHECA O ESTOQUE TOTAL
			checarEstoque = 0;
			for (Produto item : produtos) {
				checarEstoque += item.getEstoque();
			}
			// AVISA SE ESTAMOS SEM ESTOQUE
			if (checarEstoque <= 0) {
				System.out.print("\nSEM PRODUTOS NO ESTOQUE!\n");
			}
			while (continuarCompra == 'S' && checarEstoque > 0) {
				// ------------------------------------ CÓDIGO PARA COMPRA
				// --------------------------------------- MENU DE OPÇÕES
				// CABEÇALHO MENU
				System.out.print("\n");
				System.out.print("\n                    CARDÁPIO                    ");
				System.out.print("\n");
				System.out.print("\n ");
				System.out.print("\n  COD\t VALOR\t ESTOQUE  PRODUTO\n");
				// ITENS MENU
				for (Produto comida : produtos) {
					System.out.print(" \n  ");
					System.out.printf("%s\t %.2f\t  %d\t    %s\n", comida.getCodigo(), comida.getPreco(),
							comida.getEstoque(), comida.getSabor());
				}
				// IMPRIME O CARRINHO
				System.out.print("\n");
				System.out.print("\n                    CARRINHO                    ");
				System.out.print("\n");
				// SE TIVER ALGO NO CARRINHO: CABEÇALHO CARRINHO
				if (carrinho.size() > 0) {
					System.out.print("\n  QNTD\t│ NOME\n");
				}
				// SE TIVER ALGO NO CARRINHO: ITENS CARRINHO
				for (Carrinho item : carrinho) {
					System.out.print("\n  ");
					System.out.print(item.getQuantidade() + "\t│ " + item.getNomeProduto() + "\n");
				}
				do {
					// LÊ CÓDIGO
					System.out.print("\n");
					System.out.print("\n Código do produto: ");
					codigoDigitado = leia.next().toUpperCase();
					// CONSERTA ERRO DE DIGITAÇÃO DO CÓDIGO (SEM G6-)
					if (codigoDigitado.length() <= 2) {
						codigoDigitado = "G6-" + codigoDigitado;
					}
					// CHECA SE CÓDIGO EXISTE
					for (Produto item : produtos) {
						if (codigoDigitado.equals(item.getCodigo())) {
							checarCodigo = false;
							produtoEscolhido = produtos.indexOf(item);
							break;
						} else {
							checarCodigo = true;
						}
					}
					if (checarCodigo == true) {
						System.out.print("\n");
						System.out.print("\n Este produto não existe!");
						System.out.print("\n");
					} else if (produtos.get(produtoEscolhido).getEstoque() <= 0) {
						System.out.print("\n");
						System.out.print("\n Este produto já se esgotou! ");
						System.out.print("\n");
						checarCodigo = true;
					}
				} while (checarCodigo); // FIM MENU ----------------------------------------------------------
				// --------------------------------- TIRAR COMPRAS DO ESTOQUE
				System.out.print("\n VALOR\t ESTOQUE  PRODUTO\n");
				System.out.print("\n");
				System.out.print(" " + produtos.get(produtoEscolhido).getPreco());
				System.out.print("\t " + produtos.get(produtoEscolhido).getEstoque());
				System.out.print("\t   " + produtos.get(produtoEscolhido).getSabor() + "\n");

				System.out.println("Escolha o tamanho: [G]grande, [M]medio, [P]pequeno");
				System.out.println("Adicional Grande 50% | Adicional Medio 32,5% | Pequeno sem adicional");
				tamanho = leia.next().toUpperCase().charAt(0);

				if (tamanho == 'G') {
					System.out.println(
							"\nValor com adicional do tamanho: " + ((produtos.get(produtoEscolhido).getPreco() * 0.50)
									+ produtos.get(produtoEscolhido).getPreco()));
					auxTotal += ((produtos.get(produtoEscolhido).getPreco() * 0.50)
							+ produtos.get(produtoEscolhido).getPreco());
				} else if (tamanho == 'M') {
					auxTotal += ((produtos.get(produtoEscolhido).getPreco() * 0.325)
							+ produtos.get(produtoEscolhido).getPreco());
					System.out.println(
							"Valor com adicional do tamanho: " + ((produtos.get(produtoEscolhido).getPreco() * 0.325)
									+ produtos.get(produtoEscolhido).getPreco()));
				} else if (tamanho == 'P') {
					System.out.println("Valor do produto: " + (produtos.get(produtoEscolhido).getPreco()));
				} else {
					System.out.println("Tamanho inválido!");
				}

				do {
					System.out.print("\n");
					System.out.print(" Quantidade: ");
					qntdDigitada = leia.nextInt();
					if (produtos.get(produtoEscolhido).retirarEstoque(qntdDigitada)) {
						carrinho.add(new Carrinho(qntdDigitada, produtoEscolhido,
								produtos.get(produtoEscolhido).getSabor()));
						checarQntd = false;
						System.out.print("");
						qntdTotal += qntdDigitada;
					} else {
						System.out.println(" Quantidade inválida!");
						checarQntd = true;
					}
				} while (checarQntd);
				System.out.print("\n\n Continuar comprando [S/N]: ");
				continuarCompra = leia.next().toUpperCase().charAt(0);
			} // FIM COMPRA
				// CALCULA O TOTAL COM BASE NO CARRINHO
			for (Carrinho item : carrinho) {
				total += item.getQuantidade() * auxTotal;
			}
			// ------------------------------- ESCOLHER FORMA DE PAGAMENTO
			// IMPRIME O CARRINHO
			System.out.print("\n");
			System.out.print("\n                    CARRINHO                    ");
			System.out.print("\n");
			// CABEÇALHO CARRINHO
			System.out.print("\n  QNTD\t│ NOME\n");
			// ITENS CARRINHO
			for (Carrinho item : carrinho) {
				System.out.print("\n  ");
				System.out.print(item.getQuantidade() + "\t│ " + item.getNomeProduto() + "\n");
			}
			System.out.printf("\n");
			System.out.printf("\n OPÇÕES DE PAGAMENTO ");
			System.out.printf("\n");
			System.out.printf("\n ");
			System.out.printf("\n TOTAL COM IMPOSTO  R$%.2f", total = (total +(total * 0.09)));
			System.out.printf("\n ");
			System.out.printf("\n » Opção [1]: A vista      │ 10%% de desconto");
			System.out.printf("\n » Opção [2]: 1× no cartão │ 10%% de acrescimo");
			System.out.printf("\n » Opção [3]: 2× no cartão │ 15%% de acrescimo\n");

			do {
				System.out.print("\n Opção [1/2/3]: ");
				opcaoPagamento = leia.next().charAt(0);
				if (opcaoPagamento != '1' & opcaoPagamento != '2' & opcaoPagamento != '3') {
					System.out.print("\n");
					System.out.print("\n Digite uma opção válida! [1/2/3] \n");
					System.out.print("\n");
				}
			} while (opcaoPagamento != '1' & opcaoPagamento != '2' & opcaoPagamento != '3');
			if (opcaoPagamento == '1') {
				pagamento = total - (total * 0.1);
			} else if (opcaoPagamento == '2') {
				pagamento = total + (total * 0.1);
			} else if (opcaoPagamento == '3') {
				pagamento = total + (total * 0.15);
				parcela = pagamento / 2;
			}
			// ------------------------------------ EMITIR NOTA FISCAL
			System.out.print("\n Seu nome: ");
			nomeCliente = leia.next();

			// CABEÇALHO CARRINHO
			System.out.print("\n  COD\t VALOR\t QNTD\t TOTAL\t PRODUTO\n");
			// ITENS CARRINHO
			for (Carrinho item : carrinho) {
				System.out.print("  " + produtos.get(item.getIdProduto()).getCodigo() + "\t ");
				System.out.print(produtos.get(item.getIdProduto()).getPreco() + "\t ");
				System.out.print(item.getQuantidade() + "\t ");
				System.out.print((item.getQuantidade() * produtos.get(item.getIdProduto()).getPreco()) + "\t ");
				System.out.print(produtos.get(item.getIdProduto()).getSabor() + "\n");
			}
			System.out.print("------------------------------------------------------\n");
			System.out.print("\nQNTD TOTAL DE ITENS\t\t\t    " + qntdTotal);
			System.out.printf("\nVALOR TOTAL\t\t\t\t    R$ %.2f", total);

			if (opcaoPagamento == '1') {
				System.out.printf("\nDESCONTO\t\t\t\t    %.2f", ((total) * 0.1));
			} else if (opcaoPagamento == '2') {
				System.out.printf("\nACRESCIMO\t\t\t\t    %.2f", ((total) * 0.1));
			} else if (opcaoPagamento == '3') {
				System.out.printf("\nACRESCIMO\t\t\t\t    %.2f", ((total) * 0.15));
			}

			System.out.printf("\nVALOR A PAGAR\t\t\t\t    R$ %.2f", pagamento);
			System.out.print("\nFORMA DE PAGAMENTO\t\t\t    ");

			if (opcaoPagamento == '1') {
				System.out.print("A VISTA");
			} else if (opcaoPagamento == '2') {
				System.out.print("1× CARTAO");
			} else if (opcaoPagamento == '3') {
				System.out.printf("2× CARTAO\nVALOR DA PARCELA\t\t\t    %.2f", parcela);
			}

			numeroPedido++;
			System.out.print("\n\nNUMERO DO PEDIDO: " + numeroPedido + " CLIENTE: " + nomeCliente.toUpperCase());
			System.out.print("\n------------------------------------------------------\n");
			System.out.print("\n Deseja comprar? [S/N]: ");
			comprarSN = leia.next().toUpperCase().charAt(0);
		} // FIM CARRINHO

		System.out.print("\n Até breve!!\n");

		leia.close();
		// FIM DO PROGRAMA
	}
}
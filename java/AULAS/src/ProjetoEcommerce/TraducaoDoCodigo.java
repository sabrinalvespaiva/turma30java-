package ProjetoEcommerce;

public class TraducaoDoCodigo {

	public static void main(String[] args) {
		
		//op��es de pagamento
		if(op == 1) {
			descontoAVista = totalCarrinho * 0.10;
			System.out.println("Valor total da compra: " + totalCarrinho + icms - descontoAVista);
		} if (op == 2) {
			pagamentoCartao = totalCarrinho * 0.10;
			System.out.println("Valor toal da compra: " + totalCarrinho + icms + pagamentoCart�o);
		} if (op == 3) {
			pagamentoParcelado = totalCarrinho * 0.15;
			System.out.println("Valor total da compra: " + totalCarrinho + icms + pagamentoParcelado);
			System.out.println("Valor das parcelas: " (totalCarrinho + icms + pagamentoParcelado) / 2.00);
		}
	}
	
	//valida��o de estoque para informar ao cliente se o pedido pode ser realizado
	} else {
	System.out.println("----------------------------------------------------------------------------------------------------------");
	System.out.println("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE");
	System.out.println("----------------------------------------------------------------------------------------------------------");
	
	for (x = 0; x < 10; x++) {
		System.out.println("%s  \t  %s \t %.2f \t %d \n", codigo[x], produto[x], valor[x], estoque[x]);
	}
	System.out.println("Quantidade Indisponivel");
	System.out.println("Por favor, insira o codigo novamente com uma quantidade v�lida");
	}
	} else {
		System.out.println("Codigo do produto invalido, por favor, insira um codigo v�lido");
	} break;
	}
	}// fim while
	
	System.out.println("COMPRA FINALIZADA, OBRIGADA POR COMPRAR CONOSCO");
	}
	//caso o cliente informe que n�o deseja comprar
	else if (opcao == 'n' || opcao == 'N'){
		System.out.println("Volte sempre!!!");
	}
	//caso cliente digite um caracter invalido 
	else {
		System.out.println("Op��o invalida!");
	}
	}
	}
		/*//fim da 3 parte - Sabrina

	}

}

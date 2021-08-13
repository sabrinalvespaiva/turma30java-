package exerciciocollectionslist;

import java.util.ArrayList;
import java.util.List;

import exerciciocollectionslist.EstoqueClass;

public class EstoqueApplication {

	public static void main(String[] args) {

		/*
		 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa
		 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
		 * desse estoque, o programa deverá atender as seguintes funcionalidades:
		 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
		 * Apresentar todos os dados da list.
		 */

		List<EstoqueClass> estoque = new ArrayList<>();
		// ARMAZENAR DADOS DA LIST
		estoque.add(new EstoqueClass("PACOTE DE SULFITE", 500));
		estoque.add(new EstoqueClass("MARCA TEXTO ROSA", 130));
		estoque.add(new EstoqueClass("MARCA TEXTO VERDE", 250));
		estoque.add(new EstoqueClass("CANETA BIC AZUL	", 1000));
		estoque.add(new EstoqueClass("POST-IT PQUENO	", 30));

		System.out.println("MATERIAL\t\tQUANTIDADE DISPONIVEL");
		System.out.println("====================================");

		for (EstoqueClass item : estoque) {
			// herda todos os itens da classe produto
			System.out.println(item.getMaterial() + "\t" + item.getQuantidade());
		}

		//REMOVER DADOS DA LIST
		String retirar = "PACOTE DE SULFITE";

		int x = 0;
		System.out.println("Vc escolheu retirar " + retirar + " do estoque.");
		estoque.remove(x);

		//ATUALIZAR E APRESENTAR LIST
		System.out.println("NOVA LISTA");
		System.out.println("====================================");

		for (EstoqueClass item : estoque) {
			// herda todos os itens da classe produto
			System.out.println(item.getMaterial() + "\t" + item.getQuantidade());
		}

	}

}

package programas;

import entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {

		Produto prod1 = new Produto("G5-1", "camisa", 12.0, 10);
		Produto prod2 = new Produto("G5-1", "short", 12.0, 10);
		
		prod1.setNome("Camiseta");
		prod2.retirarEstoque(11);
		//prod1.incluiEstoque(5);
		
		
		System.out.println(prod2.getNome() + " "+ prod2.getEstoque());
		System.out.println(prod1.getEstoque());
		
				

	}

}

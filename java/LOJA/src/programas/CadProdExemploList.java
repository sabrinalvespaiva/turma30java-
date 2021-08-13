package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Doces;
import entidades.Produto;
import entidades.Revista;

public class CadProdExemploList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		Revista rev1 = new Revista("001", "exame", 50.00, 10, "abril");
		
		lista.add(new Revista("001", "exame", 50.00, 10, "abril"));
		//lista.add(new Livro("001", "exame", 50.00, 10, "abril"));
		lista.add(new Doces("007", "bala", 0.10, 100, "docile"));
		
		System.out.println("COD\tPRODUTO\tVALOR\tESTOQUE");
		
		for(Produto item : lista){
			//herda todos os itens da classe produto
			System.out.println(item.getCodigo()+"\t" + item.getNome()+ "\t" + item.getValor()+"\t" + item.getEstoque());
			
		}
		

	}

}

import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[] args) {
		
		String nome;
		int anoNascimento;
		int idade;
		Scanner leia = new Scanner(System.in);//cria o teclado
		
		System.out.println("Digite o nome: ");
		nome = leia.next();//apenas palavras, nextLina para ler a linha inteira
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		System.out.println("Oi " + nome + " sua idade é " + idade);
		
	}

}

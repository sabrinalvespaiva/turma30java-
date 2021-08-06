import java.util.Locale;
import java.util.Scanner;

public class CovertendoTemperatura {
	public static void main(String args []) {
		
		
		Locale.setDefault(Locale.US);
		String nome;
		double celsius;
		double fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite a temperatura em graus celsius: ");
		celsius = leia.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("Oi " + nome + " , a conversão da temperatura em graus celsius para fahrenheit é " + fahrenheit);
			
		
	}

}

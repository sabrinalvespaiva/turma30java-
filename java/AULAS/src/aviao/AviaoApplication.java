package aviao;

public class AviaoApplication {

	public static void main(String[] args) {


		AviaoClass primeiroVoo = new AviaoClass();
		primeiroVoo.numAssentos = 45;
		primeiroVoo.numFuncionarios = 5;
		primeiroVoo.status = "Aguardando o embarque de todos os passageiros para decolar!";
		primeiroVoo.piloto = false; 
		primeiroVoo.copiloto = true;
		
		System.out.printf("Bem vindos ao primeiro Voo do dia, este avi�o conta com %d assentos e com %d funcionarios \n" ,primeiroVoo.numAssentos, primeiroVoo.numFuncionarios);
		System.out.printf("Status atual: %s \n",primeiroVoo.status);
		System.out.println();
		
		if(primeiroVoo.piloto == false) {
			System.out.println("O piloto ainda n�o embarcou!");
		} else if (primeiroVoo.piloto == true) {
			System.out.println("O piloto j� embarcou!");
		}
		
		if(primeiroVoo.copiloto == false) {
			System.out.println("O copiloto ainda n�o embarcou!");
		} else if (primeiroVoo.copiloto == true) {
			System.out.println("O copiloto j� embarcou!");
		}
		
		
		

	}

}

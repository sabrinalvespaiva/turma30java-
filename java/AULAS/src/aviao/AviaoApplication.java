package aviao;

public class AviaoApplication {

	public static void main(String[] args) {


		AviaoClass primeiroVoo = new AviaoClass();
		primeiroVoo.numAssentos = 45;
		primeiroVoo.numFuncionarios = 5;
		primeiroVoo.status = "Aguardando o embarque de todos os passageiros para decolar!";
		primeiroVoo.piloto = false; 
		primeiroVoo.copiloto = true;
		primeiroVoo.freios = false;
		primeiroVoo.velocidade = 130;
		//se esta aumentando manter o reduzVelocidade em 0, se esta reduzindo manter o aumentaVelocidade em 0
		primeiroVoo.reduzVelocidade = 0;
		primeiroVoo.aumentaVelocidade = 50;
	
		
		System.out.printf("Bem vindos ao primeiro Voo do dia, este avião conta com %d assentos e com %d funcionarios \n" ,primeiroVoo.numAssentos, primeiroVoo.numFuncionarios);
		System.out.printf("Status atual: %s \n",primeiroVoo.status);
		System.out.println();
		
		if(primeiroVoo.piloto == false) {
			System.out.println("O piloto ainda não embarcou!");
		} else if (primeiroVoo.piloto == true) {
			System.out.println("O piloto já embarcou!");
		}
		
		if(primeiroVoo.copiloto == false) {
			System.out.println("O copiloto ainda não embarcou!");
		} else if (primeiroVoo.copiloto == true) {
			System.out.println("O copiloto já embarcou!");
		}
		
		if(primeiroVoo.freios == true) {
			System.out.println("Os freios estão bons.");
		} else if (primeiroVoo.freios == false) {
			System.out.println("Os freios precisam de manutenção.");
		}
		
		if(primeiroVoo.aumentaVelocidade > 0 && primeiroVoo.velocidade <= 300) {
			System.out.printf("Aumentar a velocidade em %d km - A velocidade atual é %d km" ,primeiroVoo.aumentaVelocidade, (primeiroVoo.velocidade + primeiroVoo.aumentaVelocidade));
		} else if(primeiroVoo.velocidade > 300) {
			System.out.println("Impossivel acelerar mais");
		} else if (primeiroVoo.reduzVelocidade > 0 && primeiroVoo.velocidade <= 300) { 
		System.out.printf("Reduzir velocidade em %d km - A velocidade atual é %d km",primeiroVoo.reduzVelocidade ,(primeiroVoo.velocidade - primeiroVoo.reduzVelocidade));
		} else if(primeiroVoo.velocidade <= 0) {
			System.out.println("Impossivel reduzir mais.");
		}

	}

}

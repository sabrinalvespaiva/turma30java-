package programas;

public class Carro {
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() {
		System.out.println("O carro esta ligado");
	}
	
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	void pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			System.out.println("Marcha atual: -1");
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual <= 40) {
			System.out.println("Marcha atual: 1");
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			System.out.println("Marcha atual: 2");
		} else {
			System.out.println("Marcha atual: 3");
		}
		
	}
}

package programas;

public class TesteCarro {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		meuCarro.cor = "Rosa";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 250;
		
		meuCarro.liga();
		
		meuCarro.acelera(50);
		meuCarro.pegaMarcha();
		System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
		

	}

}

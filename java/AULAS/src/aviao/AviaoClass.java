package aviao;

public class AviaoClass {
	
	//ATRIBUTOS
	public int numAssentos;
	public int numFuncionarios;
	public String status;
	public boolean piloto;
	public boolean copiloto;
	public int velocidade;
	public int reduzVelocidade;
	public int aumentaVelocidade;
	public boolean freios; 
	
	
	//METODOS 
	public void velocidade() {
		velocidade -= reduzVelocidade;
	}
	
	

}

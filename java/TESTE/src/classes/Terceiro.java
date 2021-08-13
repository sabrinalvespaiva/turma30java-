package classes;

public class Terceiro extends Funcionario{
	
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		//uso o super sempre que for fazer referencia a classe mãe
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	//metodo aqui é diferente e fou mudado atravez so override
	public double salario() {
		return (getHorasTrabalhadas() * getValorPorHora()) + adicional;
	}
	

}
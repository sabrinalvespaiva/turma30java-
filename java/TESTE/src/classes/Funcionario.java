package classes;

public class Funcionario {
	
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorHora;
	//protected é extendivel a todos as classes filhas, todos os filhos acessam e podem mexer, nao precisa acessar atravez do encapsulamento(get e set)
	
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double salario() {
		return horasTrabalhadas * valorPorHora;
	}
	
	

}

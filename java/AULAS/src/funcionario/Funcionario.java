package funcionario;

public class Funcionario {
	
	private String nome;
	public int numeroCartao;
	public int jornada;
	public String funcao;
	public int horasExtras;
	/**
	 * @param nome
	 * @param numeroCartao
	 * @param jornada
	 * @param funcao
	 * @param horasExtras
	 */
	//getter acessa o atibuto privado, na hora de imprimir usar o get
	public String getNome() {
		return nome;
	}
	
	//setter modifica o atributo privado
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getJornada() {
		return jornada;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	

}

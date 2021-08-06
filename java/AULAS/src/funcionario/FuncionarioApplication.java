package funcionario;

public class FuncionarioApplication {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Paulo");
		funcionario1.setNumeroCartao(210);
		funcionario1.setJornada(44);
		funcionario1.setFuncao("Desenvolvedor");
		funcionario1.setHorasExtras(0);
		
		System.out.printf(" Nome do funcionario é %s \n Numero do cartao de ponto: %d \n Jonarda de trabalho: %d \n Função: %s \n Horas Extras: %d",funcionario1.getNome(), funcionario1.getNumeroCartao(), funcionario1.getJornada(), funcionario1.getFuncao(), funcionario1.getHorasExtras());
		
	}

}

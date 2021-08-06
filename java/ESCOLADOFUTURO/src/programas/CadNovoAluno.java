package programas;

public class CadNovoAluno {

	public static void main(String[] args) {
		// INSTANCIAR UM ALUNO
		
		Aluno exemplo1 = new Aluno();//OBJETO DO TIPO ALUNO E POSSO FAZER QUANTOS QUISER 
		exemplo1.nome = "EPAMINONDAS";
		exemplo1.matricula = "MAT-1";
		exemplo1.nota = 5;
		exemplo1.anoNascimento = 2005;
		
		Aluno exemplo2 = new Aluno();
		exemplo2.nome = "MARIA";
		exemplo2.matricula = "MAT-2";
		exemplo2.nota = 10;
		exemplo2.anoNascimento = 1995;
		
		exemplo1.mostraIdade();//chama o metodo e exibe o que tem dentro dele 
		exemplo1.mostraIdade(2021);;//esse segundo metodo precisa informar o ano atual
		
		System.out.println(exemplo2.nome + " " + exemplo2.matricula + "e sua idade é " + (2021 - exemplo2.anoNascimento));
		
		if(exemplo2.nota >= 5) {
			System.out.println("Continue assim");
		}

	}

}

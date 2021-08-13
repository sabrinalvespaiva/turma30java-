package lista5;

import lista5.Cachorro;
import lista5.Cavalo;
import lista5.Cavalo;

public class AnimalApplication {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Minie", 6, "au au");
		System.out.println("Cachorro: "+ dog.getNome() +" "+ dog.getIdade() + " meses");
		dog.somAlto();
		dog.emiteSom();
		
		Cavalo horse = new Cavalo("Spirit", 5, "relinchar", true);
		System.out.println("Cavalo: " + horse.getNome() + "  "+ horse.getIdade());
		horse.somBaixo();
		horse.emiteSom();
		
		Preguica sloth = new Preguica("Catalendas", 1, "gritinho");
		System.out.println("Preguiça: " + sloth.getNome() +" "+ sloth.getIdade());
		sloth.somBaixo();
		sloth.emiteSom();
		
	

	}

}

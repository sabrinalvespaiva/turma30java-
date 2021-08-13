package application;

import entities.Ave;
import entities.Cachorro;
import entities.Pet;

public class TestePet {

	public static void main(String[] args) {
		
		Pet animal1 = new Pet("SHITZU", 2020);
		animal1.setPorte('p');
		
		System.out.println(animal1.getRaca());
		System.out.println("Idade do animal ");
		animal1.emiteSom();
		System.out.println("A idade é "+animal1.idade());
		
		
		Cachorro animal2 = new Cachorro ("golden" , true);
		animal2.latidoAlto();
		
		Ave ave1 = new Ave("Coruja-da-igreja", 'M', 2018, true);
		System.out.println();
		ave1.Voa();
		
	}
	
	//cachorro - pet - latidoAlto boolean - construtor fazer 2 construtores
	//gato - pet - miadoAlto boolean - construtor 
	//ave - pet - voa boolean - construtor
	
	
	
	

}

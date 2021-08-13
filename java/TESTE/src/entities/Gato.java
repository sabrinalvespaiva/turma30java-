package entities;

public class Gato extends Pet {
	
	private boolean miadoAlto;

	//CARGA 
	public Gato(String raca, boolean miadoAlto) {
		super(raca);
		this.miadoAlto = miadoAlto;
	}
	
	//SOBRECARGA DO CONST
	public Gato(String raca, char porte, int anoNascimento, boolean miadoAlto) {
		super(raca, porte, anoNascimento);
		this.miadoAlto = miadoAlto;
	}

	public boolean getMiadoAlto() {
		return miadoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.miadoAlto = latidoAlto;
	}

	public void miadoAlto() {
		if(miadoAlto == true) {
			System.out.println("MIAU MIAU");
		} else if (miadoAlto == false) {
			System.out.println("miau miau");
		}
	}
	
	//polimorfismo só ocorre em classe filhas
	@Override //(é a mãe dando tudo pro filho) para dizer que estou mudando o metodo
	public void emiteSom() {
		if(miadoAlto) {
			System.out.println("MIAU MIAU");
		} else {
		System.out.println("miau miau");
		}
	}

}

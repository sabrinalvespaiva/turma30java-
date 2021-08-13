package entities;

public class Cachorro extends Pet{
	
	private boolean latidoAlto;

	/**
	 * @param raca
	 * @param latidoAlto
	 */
	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}
	
	public boolean getLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

	public void latidoAlto() {
		if(latidoAlto == true) {
			System.out.println("AU AU");
		} else if (latidoAlto == false) {
			System.out.println("au au");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("au au au au");
	}

}

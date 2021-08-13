package entities;

public class Ave extends Pet{
	
	private boolean voa;

	/**
	 * @param raca
	 * @param porte
	 * @param anoNascimento
	 * @param voa
	 */
	public Ave(String raca, char porte, int anoNascimento, boolean voa) {
		super(raca, porte, anoNascimento);
		this.voa = voa;
	}

	public boolean getVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}

	public void Voa() {
		if(voa == true) {
			System.out.println("ave voando");
		} else if (voa == false) {
			System.out.println("ave não voando");
		}
	}
	
	

}

package Exemplo;

public class Cachorro extends Animal {

	private String raca;
	private boolean temPeloCurto;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isTemPeloCurto() {
		return temPeloCurto;
	}

	public void setTemPeloCurto(boolean temPeloCurto) {
		this.temPeloCurto = temPeloCurto;
	}

	@Override
	public String emiteSom() {
		return "au...au...";
	}
}

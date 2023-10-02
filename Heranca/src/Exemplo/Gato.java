package Exemplo;

public class Gato extends Animal {
	private String alimentacao;
	
	
	public String getAlimentacao() {
		return alimentacao;
	}



	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}



	@Override
	public String emiteSom() {
		return "miau... miau...";
	}



	@Override
	public int numSemanaGestacaoMedia() {
		return 9;
	}

}

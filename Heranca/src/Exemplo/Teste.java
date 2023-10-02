package Exemplo;

public class Teste {
	
	public static void main(String[] args) {
		
		Animal c1 = new Cachorro();
		c1.setCadastroMunicipal("a123");
		c1.setDono("Aroldo");
		c1.setNome("PITCHULA");
		System.out.println(c1.emiteSom()) ;

		Cachorro c2 = (Cachorro) c1;
		c2.setRaca("beagle");
		c2.setTemPeloCurto(true);
		System.out.println(c2.emiteSom()) ;
	}

}

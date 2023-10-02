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
		System.out.println("gestacao cachorro em semana media: "+ c2.numSemanaGestacaoMedia()) ;
		
		Gato g1 = new Gato();
		g1.setAlimentacao("carnivoro");
		g1.setNome("guerreiro");
		g1.setCadastroMunicipal("b123");
		g1.setDono("Bruno");
		System.out.println(g1.emiteSom());
		System.out.println("gestacao gato em semana media: "+ g1.numSemanaGestacaoMedia()) ;
	}

}

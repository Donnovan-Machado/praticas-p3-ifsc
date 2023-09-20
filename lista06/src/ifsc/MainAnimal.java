package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		cachorro.setNome("Guiven");
		cachorro.setRaca("Vira-lata");
		cachorro.setCor("Preto e Branco");
		cachorro.setEcossistema("Domestico");
		cachorro.setComprimento(5.45f);
		cachorro.setNumeroPatas(4);
		
		gato.setNome("Marcia");
		gato.setRaca("Malhado");
		gato.setCor("Preto, Branco e Laranja");
		gato.setEcossistema("Domestico");
		gato.setComprimento(4.45f);
		gato.setNumeroPatas(4);
		
		cachorro.caminha();
		cachorro.late();
		
		gato.caminha();
		gato.mia();
		
		
	}

	
	
}

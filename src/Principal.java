
public class Principal {
	public static void main(String[] args) {
		
		Carro meuFusquinha = new Carro("Fusca 67");
		meuFusquinha.setQuantidadePortas(0);
		meuFusquinha.setQuantidadeRodas(4);
		meuFusquinha.setCor("Vermelho");
		
		System.out.println(Carro.DOMINIO + " é do modelo " + meuFusquinha.getModelo());
		System.out.println(Carro.DOMINIO + " tem o total de " + meuFusquinha.getQuantidadePortas() + " portas.");
		System.out.println(Carro.DOMINIO + " tem o total de " + meuFusquinha.getQuantidadeRodas() + " rodas.");
		System.out.println(Carro.DOMINIO + " é da cor " + meuFusquinha.getCor());
	
	}
}

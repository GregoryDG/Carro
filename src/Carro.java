
public class Carro {
	
	public final static String DOMINIO = "Carro";
	private String modelo;
	private int quantidadePortas;
	private String cor;
	private int quantidadeRodas;
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	
	public void setQuantidadePortas (int quantidadePortas) {
		if(quantidadePortas < 1){
			System.out.println(Mensagens.MENSAGEM_ERRO_VALICAO_QUANTIDADE_PORTA);
		} else {
			this.quantidadePortas = quantidadePortas;
		}
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
}

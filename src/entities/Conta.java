package entities;

public class Conta {

	// atributos da conta
	private char genero;
	private int cervejas;
	private int refrigerantes;
	private int espetinhos;
		
	// construtor que inicializa todos os atributos com segurança na classe Main
	public Conta(char genero, int cervejas, int refrigerantes, int espetinhos) {
		this.genero = genero;
		this.cervejas = cervejas;
		this.refrigerantes = refrigerantes;
		this.espetinhos = espetinhos;
	}

	// método que calcula o valor do consumo
	public double consumo() {
		return (cervejas * 5.0) + (refrigerantes * 3.0) + (espetinhos * 7.0);
	}

	// métodos getters abaixo que permitem acessar na classe principal os valores dos atributos
	
	public char getGenero() {
		return genero;
	}

	public int getCervejas() {
		return cervejas;
	}

	public int getRefrigerantes() {
		return refrigerantes;
	}

	public int getEspetinhos() {
		return espetinhos;
	}

	// método que calcula o valor do couvert de acordo com as regras de negócio (acima de R$ 30.00 o valor é isento)
	public double couvert() {
		if (consumo() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	// método que calcula o valor do ingresso de acordo com as regras de negócio (de acordo com o genero do(a) cliente)
	public double ingresso() {
		if (genero == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	// método que calcula o valor total da conta(incluindo o couvert e o valor do ingresso)
	public double valorTotal() {
		return consumo() + couvert() + ingresso();
	}

}

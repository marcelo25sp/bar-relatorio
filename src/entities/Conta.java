package entities;

public class Conta {

	private char genero;
	private int cervejas;
	private int refrigerantes;
	private int espetinhos;

	public double consumo() {
		return (cervejas * 5.0) + (refrigerantes * 3.0) + (espetinhos * 7.0);
	}

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

	public double couvert() {
		if (consumo() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public double ingresso() {
		if (genero == 'M') {
			return 10.0;
		} else {
			return 8.0;
		}
	}

	public double valorTotal() {
		return consumo() + couvert() + ingresso();
	}

}

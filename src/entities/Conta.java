package entities;

public class Conta {

	public char genero;
	public int cervejas;
	public int refrigerantes;
	public int espetinhos;

	public double consumo() {
		return (cervejas * 5.0) + (refrigerantes * 3.0) + (espetinhos * 7.0);
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

package entities;

public class Conta {

	private char genero;
	private int cervejas;
	private int refrigerantes;
	private int espetinhos;

	public double consumo() {
		return cervejas + refrigerantes + espetinhos;
	}

	public double couvert() {
		if (consumo() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

}

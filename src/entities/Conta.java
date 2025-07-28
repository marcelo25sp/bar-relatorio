package entities;

public class Conta {
	
	private char genero;
	private int cervejas;
	private int refrigerantes;
	private int espetinhos;

	public double consumo() {
		return cervejas + refrigerantes + espetinhos;
	}
	
	
}

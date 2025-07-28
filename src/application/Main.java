package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta = new Conta();

		System.out.print("Genero: ");
		conta.genero = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		conta.cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		conta.refrigerantes = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		conta.espetinhos = sc.nextInt();

		sc.close();

	}

}

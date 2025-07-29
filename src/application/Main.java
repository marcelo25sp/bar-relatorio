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
		conta.genero = Character.toUpperCase(sc.next().charAt(0));
		System.out.print("Quantidade de cervejas: ");
		conta.cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		conta.refrigerantes = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		conta.espetinhos = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("----------");

		System.out.printf("Consumo: R$ %.2f%n", conta.consumo());

		if (conta.couvert() == 0.0) {
			System.out.println("Isento de couvert...");
		} else {
			System.out.printf("Couvert: R$ %.2f%n", conta.couvert());
		}
		
		System.out.printf("Ingresso: R$ %.2f%n", conta.ingresso());

		System.out.println();

		System.out.printf("Valor Total a Pagar: R$ %.2f%n", conta.valorTotal());

		sc.close();

	}

}

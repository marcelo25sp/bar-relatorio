package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	/*
	 * Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres.
	 * Cada cerveja custa 5 reais, cada refrigerante 3 reais e cada espetinho custa
	 * 7. Além disso, o bar cobra uma taxa de couvert artístico no valor de 4 reais,
	 * porém, se o valor gasto com consumo for superior a 30 reais, o couvert
	 * artístico não é cobrado. Fazer um programa para ler os seguintes dados de um
	 * cliente do bar: sexo (F ou M), quantidade de cervejas, refrigerantes e
	 * espetinhos consumidos. O programa deve então mostrar um relatório com a conta
	 * a ser paga pelo cliente. 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Define o padrão de formatação numérica para o formato dos EUA (ex: ponto em
										// vez de vírgula)
		Scanner sc = new Scanner(System.in);

		

		// entrada de dados do usuário para a impressão do relatório(conta)
		System.out.print("Genero: ");
		char genero = Character.toUpperCase(sc.next().charAt(0)); // Converte para maiúsculo para evitar erro em 'f' ou 'm'
		System.out.print("Quantidade de cervejas: ");
		int cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int refrigerantes = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();
		// cria o objeto Conta que armazena os dados do cliente acessando os atributos da classe Conta
		Conta conta = new Conta(genero, cervejas, refrigerantes, espetinhos);

		// geração do relatório
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");

		// exibe o valor do consumo total
		System.out.printf("Consumo: R$ %.2f%n", conta.consumo());

		// exibe o valor cobrado do couvert(caso o consumo seja maior que R$ 30.00)
		if (conta.couvert() == 0.0) {
			System.out.println("Isento de couvert...");
		} else {
			System.out.printf("Couvert: R$ %.2f%n", conta.couvert());
		}

		// exibe o valor do ingresso (diferente para homem e mulher)
		System.out.printf("Ingresso: R$ %.2f%n", conta.ingresso());
		
		System.out.println();
		
		//exibe o valor final da conta
		System.out.printf("Valor Total a Pagar: R$ %.2f%n", conta.valorTotal());

		sc.close();

	}

}

package br.com.entra21.java.advanced.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {

			System.out.println("Escolha uma das op��es: \n");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();
			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida");
				break;
			}
		} while (option != 0);
		System.out.println("Volte sempre que quiser aprender list:");

	}

	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ariana");
		nomes.add("Bruno");
		nomes.add("Fulano");
		nomes.add(0, "primeiro");
		nomes.add("Rubem");
		System.out.println("Quantos nomes ? " + nomes.size());

		for (String item : nomes) {
			System.out.println("O nome no momento � " + item);

		}
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));

		}
		System.out.println("O primeiro nome � " + nomes.get(0));
		System.out.println("O segundo nome � " + nomes.get(1));
		System.out.println("O terceiro � " + nomes.get(2));
		System.out.println("O quarto � " + nomes.get(3));

		nomes.set(2, "Bruno Atualizado");
		System.out.println("O terceiro � " + nomes.get(2));

		nomes.set(0, nomes.get(3).toUpperCase());
		System.out.println("O primeiro nome � " + nomes.get(0));

		System.out.println("Onde ser� que est� o Rubem ? " + nomes.indexOf("Rubem")); // utiliza o indexOF para pegar a
																						// posi��o do elemento // � UMA
																						// BUSCA

		System.out.println("Vou deletar quem estiver no �ndice 2 " + nomes.get(2));
		nomes.remove(2);

		nomes.remove(nomes.indexOf("Rubem"));

		// Criar uma lista de interesses
		// inclua 5 interesses
		// liste todos os interesses
		// dessa lista escolha dois para favoritos
		// exclua um item por posi��o e outro por valor
		// um syso explicando cada a��o

		ArrayList<String> interesses = new ArrayList<>();
		System.out.println("Primeiro fazemos a parte de ArrayList para percorrer, neste caso como interesses");
		System.out.println("A vari�vel interesses ter� os seguintes valores:");

		interesses.add("Java");
		interesses.add("JavaScript");
		interesses.add("Python");
		interesses.add("CSS");
		interesses.add("React");

		System.out.println("Percebe-se que temos um total de " + nomes.size() + " interesses ");

		for (String interesse : interesses) {
			System.out.println("\t" + interesse);

			System.out.println("No momento o interesse � " + interesses);

			System.out.println("A minha prefer�ncia nos interesses atualmente � " + interesses.get(0));

			System.out.println("O meu outro interesse favoreito est� na posi��o " + interesses.indexOf("Python"));

			System.out.println("Portanto, meu outro interesse � " + interesses.get(2));

			System.out.println("Caso tenha que excluir um de aprender, infelizmente seria " + interesses.get(4));

			interesses.remove(4);

			System.out.println("Portanto, tivemos essa breve explica��o");

		}

	}

	private static void aprenderLinkedList() {
	}
}
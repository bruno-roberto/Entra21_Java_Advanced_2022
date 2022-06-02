package br.com.entra21.java.advanced.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollections {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {

			System.out.println("Escolha uma das opções: \n");
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
				System.out.println("Escolha uma opção válida");
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
			System.out.println("O nome no momento é " + item);

		}
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));

		}
		System.out.println("O primeiro nome é " + nomes.get(0));
		System.out.println("O segundo nome é " + nomes.get(1));
		System.out.println("O terceiro é " + nomes.get(2));
		System.out.println("O quarto é " + nomes.get(3));

		nomes.set(2, "Bruno Atualizado");
		System.out.println("O terceiro é " + nomes.get(2));

		nomes.set(0, nomes.get(3).toUpperCase());
		System.out.println("O primeiro nome é " + nomes.get(0));

		System.out.println("Onde será que está o Rubem ? " + nomes.indexOf("Rubem")); // utiliza o indexOF para pegar a
																						// posição do elemento // É UMA
																						// BUSCA

		System.out.println("Vou deletar quem estiver no índice 2 " + nomes.get(2));
		nomes.remove(2);

		nomes.remove(nomes.indexOf("Rubem"));

		// Criar uma lista de interesses
		// inclua 5 interesses
		// liste todos os interesses
		// dessa lista escolha dois para favoritos
		// exclua um item por posição e outro por valor
		// um syso explicando cada ação

		ArrayList<String> interesses = new ArrayList<>();
		System.out.println("Primeiro fazemos a parte de ArrayList para percorrer, neste caso como interesses");
		System.out.println("A variável interesses terá os seguintes valores:");

		interesses.add("Java");
		interesses.add("JavaScript");
		interesses.add("Python");
		interesses.add("CSS");
		interesses.add("React");

		System.out.println("Percebe-se que temos um total de " + nomes.size() + " interesses ");

		for (String interesse : interesses) {
			System.out.println("\t" + interesse);

			System.out.println("No momento o interesse é " + interesses);

			System.out.println("A minha preferência nos interesses atualmente é " + interesses.get(0));

			System.out.println("O meu outro interesse favoreito está na posição " + interesses.indexOf("Python"));

			System.out.println("Portanto, meu outro interesse é " + interesses.get(2));

			System.out.println("Caso tenha que excluir um de aprender, infelizmente seria " + interesses.get(4));

			interesses.remove(4);

			System.out.println("Portanto, tivemos essa breve explicação");

		}

	}

	private static void aprenderLinkedList() {
	}
}
package com.youcode.polymEX2;

import java.util.Scanner;

public class Main {
	static Ouvrage ouv = new Ouvrage();
	static Scanner in = new Scanner(System.in);
	static boolean running = true;

	public static void main(String[] args) {
		/*
		 * Bibliotheque[] biblio = new Bibliotheque[5]; biblio[0] = new
		 * Ouvrage("HARRY POTTER", "1993", true); biblio[1] = new
		 * Ouvrage("ouvrage 2", "2019", false); biblio[2] = new
		 * Ouvrage("ouvrage 3", "2010", true); biblio[3] = new
		 * Ouvrage("ouvrage 4", "2020", true); biblio[4] = new
		 * Ouvrage("ouvrage 5", "2005", true);
		 */
		while (running) {
			System.out.println("\n enter 0 for load a library"
					+ "enter 1 for save and quit"
					+ "Enter 2 for list all books in library"
					+ " enetr 3 for add book to library");
			int answer = in.nextInt();
			switch (answer) {
			case 0:
				System.out.println("enter the file name to load");
				break;
			case 1:
				break;
			case 2:
				System.out.println(lib.toString());

				break;
			case 3:
				addBook(null);
				break;
			}

		}

	}
}

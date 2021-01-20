package edonova.zadatci;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		ucitajBroj();

	}

	public static void ucitajBroj() {
		int i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Unesi broj");
			i = input.nextInt();

		} while (i <= 0);
		input.close();

	}
}
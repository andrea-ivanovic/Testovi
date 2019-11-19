package test;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Ukoliko kupac kupi robu u iznosu većem od 1500 dinara, dobija 10% popusta, a
		 * ukoliko kupi robu u iznosu većem od 7000 dinara dobija 20% popusta. Napisati
		 * program koji će za uneti iznos odabrane robe ispisati koliko zapravo treba
		 * platiti.
		 * 
		 * >1500 -10% 1600- 160
		 * 
		 * >7000 -20% 8000 - 1600
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost robe");
		double cena = sc.nextDouble();
		double platiti = 0;

		if (cena > 1500 && cena < 7000) {

			platiti = cena - (cena / 10);

			System.out.println("Vas racun je " + platiti);
		}

		else if (cena > 7000) {
			platiti = cena - (cena / 10 * 2);
			System.out.println("Vas racun je " + platiti);
		}

		else
			System.out.println("Niste ostvariri popust za ovu kupovinu. Vas racun je " + cena);

	}

}

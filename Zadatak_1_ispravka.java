package vezbe;

import java.util.Scanner;

public class Zadatak_1_ispravka {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite uneste? ");
		int n = sc.nextInt();

		double min;

		System.out.println("Unesite prvi broj: ");

		double broj1 = sc.nextDouble();
		System.out.println("Nastavite unos brojeva");

		min = broj1;

		int brojac = n - 1;
		while (brojac <= n) {

			broj1 = sc.nextDouble();

			if (broj1 < min)
				min = broj1;
			brojac++;

		}
		System.out.println("Najmanji uneti broj je " + min);
	}

}
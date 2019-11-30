package domaciTreciDeo;

import java.util.Scanner;

public class Test2_Ispravka {

	public static String podaciStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime i prezime studenta. ");

		String imePrezime = sc.nextLine();

		return imePrezime;
	}

	public static void rezultat(int brojPitanja, String imePrezime) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Unesite odgovor na pitanja. Ako je odgovor tacan, unesite 'true', ako je odgovor netacan unesite 'false'.");

		boolean[] odgovor = new boolean[brojPitanja];

		int tacniOdgovori = 0;

		for (int i = 0; i < brojPitanja; i++) {

			odgovor[i] = sc.nextBoolean();
		}

		for (int i = 0; i < brojPitanja; i++) {
			if (odgovor[i] == true)
				tacniOdgovori += 1;
		}

		if (tacniOdgovori >= brojPitanja / 2 && tacniOdgovori > 1) {
			System.out.println(
					"Student je polozio test. Cestitamo! " + "Broj tacnih odgovora je " + tacniOdgovori + " .");
		} else {

			int nedostajeTacnihOdg = 100 * (brojPitanja - tacniOdgovori) / brojPitanja;

			System.out.println(
					"Student nije polozio test. Studentu nedostaje " + nedostajeTacnihOdg + " tacnih odgovora.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko test ima pitanja?");

		int brojPitanja = sc.nextInt();

		while (brojPitanja <= 0) {
			System.out.println("Pogresan unos, pokusajte ponovo!");
			System.out.println("Unesite koliko ima pitanja na testu:");
			brojPitanja = sc.nextInt();
		}
		
		rezultat(brojPitanja, podaciStudent());
	

		String stop = "sledeci";

		while (stop.equals("sledeci")) {
			System.out.println(
					"Ukucajte 'sledeci' za ocenjivanje sledeceg studenta. Unesite bilo sta drugo za prekid programa.");
			stop = sc.next();  
		
		}
		
		
	}
}


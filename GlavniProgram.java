package flase;

import java.util.ArrayList;

public class GlavniProgram {

	public static void main(String[] args) {
		ArrayList<Flasa> listaFlasa = new ArrayList<Flasa>();
		
	//	Flasa P = new plasticnaFlasa (new Nalepnica ("naziv"), pa ostatak)

		Nalepnica n1 = new Nalepnica("Kola");
		Nalepnica n2 = new Nalepnica("Stella");

		StaklenaFlasa sf1 = new StaklenaFlasa(n1, 100, 0.33, "BEZALKOHOLNO");
		StaklenaFlasa sf2 = new StaklenaFlasa(n1, 150, 0.5, "BEZALKOHOLNO");
		StaklenaFlasa sf3 = new StaklenaFlasa(n1, 50, 0.5, "BEZALKOHOLNO");

		PlasticnaFlasa pf1 = new PlasticnaFlasa(n2, 200, 0.33, "ALKOHOLNO");
		PlasticnaFlasa pf2 = new PlasticnaFlasa(n2, 220, 0.5, "ALKOHOLNO");

		listaFlasa.add(sf1);
		listaFlasa.add(sf2);
		listaFlasa.add(pf1);
		listaFlasa.add(pf2);

		double ukupnaVrednost = 0;

		for (int i = 0; i < listaFlasa.size(); i++)
			ukupnaVrednost += listaFlasa.get(i).getCenaBezKaucije();
		System.out.println("Ukupna vrednost svih flasa u Vasoj korpi je: " + ukupnaVrednost + "RSD");

		System.out.println();
		System.out
				.println("Flasa koja je na prvoj poziciji na Vasoj polici s picem je " + listaFlasa.get(1).toString());
		System.out.println();

		System.out.println("Cena bez kaucije: " + sf3.getCenaBezKaucije() + "RSD");
		System.out.println("Cena sa kaucjom: " + sf3.cenaSaKaucijom() + "RSD");

		sf3.setCenaBezKaucije(80);
		System.out.println("Cena je poskupela. Nova cena je " + sf3.getCenaBezKaucije() + "RSD.");
		
		System.out.println();
		
		System.out.println(pf2.toString());

	}
//metoda za cenu   prosledis jojs ArrayList <Flasa>listaFlasa ali joj je polje protected za cenu bez kaucije pa moze i odavde da se dohvati
	//for flasa f : inventar  ukupnacena+= f.cenaBez; return ukupCena... u f smesta element 
}

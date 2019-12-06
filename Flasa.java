package flase;

public class Flasa {
	private Nalepnica nalepnica;
	private double cenaBezKaucije;
	private double zapremina;
	private String vrstaPica;

	public Flasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, String vrstaPica) {

		this.nalepnica = nalepnica;
		this.cenaBezKaucije = cenaBezKaucije;
		this.zapremina = zapremina;

		if (vrstaPica.toUpperCase().equals("BEZALKOHOLNO") || vrstaPica.toUpperCase().equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica.toUpperCase();
		else
			System.out.println("Pogresan unos vrste pice. Ukucajte 'alkoholno' ili 'bezalkoholno' .");
	}

	public Flasa(Nalepnica nalepnica, double cenaBezKaucije, String vrstaPica) {

		this.nalepnica = nalepnica;
		this.cenaBezKaucije = cenaBezKaucije;
		this.zapremina = 0.33; // podrazumevana zapremina pri kreiranju
		if (vrstaPica.toUpperCase().equals("BEZALKOHOLNO") || vrstaPica.toUpperCase().equals("ALKOHOLNO"))
			this.vrstaPica = vrstaPica.toUpperCase();
		else
			System.out.println("Pogresan unos vrste pice. Ukucajte 'alkoholno' ili 'bezalkoholno' .");
	}

	public Nalepnica getNalepnica() {
		return nalepnica;
	}

	public double getCenaBezKaucije() {
		return cenaBezKaucije;
	}

	public double getZapremina() {
		return zapremina;
	}

	public String getVrstaPica() {
		return vrstaPica;
	}

	public void setCenaBezKaucije(double cenaBezKaucije) {
		if (cenaBezKaucije < 0)
			System.out.println("Cena ne moze biti manja od nule.");
		else {
			this.cenaBezKaucije = cenaBezKaucije;
		}
	}

	public String toString() {
		return nalepnica + "(" + cenaBezKaucije + "," + zapremina + "," + vrstaPica + ")";
	}
}

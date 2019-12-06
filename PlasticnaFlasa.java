package flase;

public class PlasticnaFlasa extends Flasa {

	private double cenaSaKaucijom;

	public PlasticnaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, String vrstaPica) {
		super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);
		cenaSaKaucijom = cenaBezKaucije;
	}

	public PlasticnaFlasa(Nalepnica nalepnica, double cenaBezKaucije, String vrstaPica) {
		super(nalepnica, cenaBezKaucije, vrstaPica);

		cenaSaKaucijom = cenaBezKaucije;

	}

	public double cenaSaKaucijom() {
		return cenaSaKaucijom;
	}

	public String toString() {
		return super.toString() + "-" + "plasticna";
	}

}

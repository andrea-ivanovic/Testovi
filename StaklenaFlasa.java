package flase;

public class StaklenaFlasa extends Flasa {

	private double cenaSaKaucijom;

	public StaklenaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, String vrstaPica) {
		super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);

	}

	public StaklenaFlasa(Nalepnica nalepnica, double cenaBezKaucije, String vrstaPica) {
		super(nalepnica, cenaBezKaucije, vrstaPica);

	}

	public double cenaSaKaucijom() {

		if (super.getZapremina() < 0.5) {
			cenaSaKaucijom = super.getCenaBezKaucije() * 1.05;
		}
		if (super.getZapremina() >= 0.5) {
			cenaSaKaucijom = super.getCenaBezKaucije() * 1.1;

		}
		return cenaSaKaucijom;

	}

	public String toString() {
		return super.toString() + "-" + "staklena";
	}
}

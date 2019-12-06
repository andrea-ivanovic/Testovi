package flase;

public class Nalepnica {

	private String naziv;
	public static int idGlobal = 1;
	private int id;

	public Nalepnica(String naziv) {

		this.naziv = naziv;

		id = idGlobal++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return naziv + ":" + id;
	}

}

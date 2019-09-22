package domaci;

public class Pozoriste {
	
	private static int staticId;
	String naziv;
	private int id;
	
	public Pozoriste(String naziv) {
		this.naziv = naziv;
		this.id = staticId + 1;
		staticId++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return naziv + " [ " + id + " ] ";
	}
	
	public String getSkraceniNaziv () {
		StringBuilder sb = new StringBuilder();
		String [] nizReci = naziv.split(" ");
		for ( int i = 0; i < nizReci.length; i++) {
			sb.append(nizReci[i].charAt(0));
		}
		return sb.toString().toUpperCase();	
	}
	
	
	
	
	

}

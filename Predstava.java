package domaci;

import java.util.ArrayList;

public class Predstava {

	String naziv;
	Pozoriste pozoriste;
	ArrayList<Zaposleni> zaposleni;
	int brKostimografa;

	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		if (reditelj.nijeUIstomPozoristu(pozoriste)) {
			return;
		}
		zaposleni = new ArrayList<Zaposleni>();
		this.zaposleni.add(reditelj);
		this.naziv = naziv;
		this.pozoriste = pozoriste;
	}

	public boolean dodaj(Glumac g) {
		if (g.nijeUIstomPozoristu(pozoriste)) {
			return false;
		}
		zaposleni.add(g);
		return true;
	}

	public boolean dodaj(Kostimograf g) {
		if (g.nijeUIstomPozoristu(pozoriste)) {
			return false;
		}
		if (brKostimografa == 2) {
			System.out.println("Vec 2 kostimografa rade.");
			return false;
		} else {
			zaposleni.add(g);
			brKostimografa++;
			return true;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv);
		sb.append(": \n");
		for ( int i = 0; i< zaposleni.size(); i++) {
			sb.append(zaposleni.get(i).toString());
		}
		return sb.toString();
	}
	
	

	
	
	

}

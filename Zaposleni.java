package domaci;

public abstract class Zaposleni {

	String ime;
	Pozoriste pozoriste;

	public Zaposleni(String ime, Pozoriste pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String imePosla() {     //telo metode imePosla mi je isto za sve child klase pa zato nije abstract i ovde je definisano
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return ime + " (" + imePosla() + ", " + pozoriste.getSkraceniNaziv() + ")\n";
	}

	public boolean nijeUIstomPozoristu(Pozoriste p) {
		if (this.getPozoriste().getId() != p.getId()) {
			System.out.println( this.getClass().getSimpleName() + " mora da bude zaposleni u pozoristu u kojem se igra predstava.");
			return true;
		}
		return false;
	}
}

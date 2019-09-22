package domaci;

import java.util.ArrayList;

public class Repertoar {

	Pozoriste pozoriste;
	ArrayList<Predstava> predstave;

	public Repertoar(Pozoriste pozoriste) {
		predstave = new ArrayList<Predstava>();
		this.pozoriste = pozoriste;
	}

	public void dodaj(Predstava p) {
		predstave.add(p);
	}

	public void ukloni(String imePredstave) {
		int i = 0;
		for (; i < predstave.size(); i++) {
			if (predstave.get(i).getNaziv().equals(imePredstave)) {
				break;
			}
		}
		predstave.remove(i);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pozoriste.getNaziv());
		sb.append(": [\n\n");
		for ( int i = 0; i< predstave.size(); i++) {
			sb.append(predstave.get(i).toString());
			sb.append("\n");
		}
		sb.append("]");
		return sb.toString();
	}

}

package P4_BidirektionaleAssoziation_n_m_DAO_Pattern;

public class Startklasse {
	
	public static void main(String[] args) {
		Schueler moritz = new Schueler("HŸther", "Moritz");
		Schueler fabian = new Schueler("Karler","Fabian");
		
		Fach e = new Fach("Englisch", "E");
		Fach m = new Fach("Mathematik","M");
		

		Bewertung englischtest1 = new Bewertung(moritz.getIdSchueler(), e.getIdFach(), 1.3, 2);
		Bewertung mathearbeit   = new Bewertung(moritz.getIdSchueler(), m.getIdFach(), 2.4, 4);
		Bewertung mathearbeit2   = new Bewertung(fabian.getIdSchueler(), m.getIdFach(), 2.2, 4);
		
	}
}

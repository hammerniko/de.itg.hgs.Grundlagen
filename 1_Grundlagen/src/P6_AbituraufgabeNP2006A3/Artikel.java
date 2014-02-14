package P6_AbituraufgabeNP2006A3;

public class Artikel {

	private String artikelNummer;
	private double gewichtProQm;
	private String artikelbezeichnung;
	
	
	public String gibArtikelNummer() {
		return artikelNummer;
	}
	
	public double gibGewichtProQm() {
		return gewichtProQm;
	}

	public Artikel(String artikelNummer, double gewichtProQm) {
		super();
		this.artikelNummer = artikelNummer;
		this.gewichtProQm = gewichtProQm;
	}

    public String gibArtikelBezeichnung() {
        return artikelbezeichnung;
    }
	
    
	
	
}

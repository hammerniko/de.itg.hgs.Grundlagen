package P6_AbituraufgabeNP2006A3;

public class Kunde {

	private String kundenName;
	private int kundenNummer;
	
	public String gibKundenName() {
		return kundenName;
	}


	public Kunde(int kdNr, String kundenName) {
		super();
		this.kundenName = kundenName;
		this.kundenNummer = kdNr;
	}
	
	
}

package P2_OOPProbearbeitUnidirektionaleAssoziation1ZuN;


public class Auto {
	
	private String marke;
	private String typ;
	
	
	
	
	
	@Override
	public String toString() {
		return "Auto [marke=" + marke + ", typ=" + typ + "]";
	}

	public Auto(String marke, String typ) {
		this.marke = marke;
		this.typ = typ;
	}
	
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	

}

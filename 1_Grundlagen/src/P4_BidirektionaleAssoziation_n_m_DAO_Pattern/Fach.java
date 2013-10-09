package P4_BidirektionaleAssoziation_n_m_DAO_Pattern;

public class Fach {
	private int idFach;
	private String fachname;
	private String fachkuezel;
	
	public Fach(String fachname, String fachkuezel) {
	    super();
	    this.fachname = fachname;
	    this.fachkuezel = fachkuezel;
	    idFach++;
    }

	public int getIdFach() {
    	return idFach;
    }

	public void setIdFach(int idFach) {
    	this.idFach = idFach;
    }

	public String getFachname() {
    	return fachname;
    }

	public void setFachname(String fachname) {
    	this.fachname = fachname;
    }

	public String getFachkuezel() {
    	return fachkuezel;
    }

	public void setFachkuezel(String fachkuezel) {
    	this.fachkuezel = fachkuezel;
    }
	
	
	
}

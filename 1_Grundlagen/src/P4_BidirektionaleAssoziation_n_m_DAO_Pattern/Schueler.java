package P4_BidirektionaleAssoziation_n_m_DAO_Pattern;

public class Schueler {
	int idSchueler;
	String name;
	String vorname;
	
	public Schueler(String name, String vorname) {
	    super();
	    this.name = name;
	    this.vorname = vorname;
	    idSchueler++;
    }
	
    
	public int getIdSchueler() {
    	return idSchueler;
    }


	public void setIdSchueler(int idSchueler) {
    	this.idSchueler = idSchueler;
    }


	public String getName() {
    	return name;
    }
	public void setName(String name) {
    	this.name = name;
    }
	public String getVorname() {
    	return vorname;
    }
	public void setVorname(String vorname) {
    	this.vorname = vorname;
    }
	
	
	
}

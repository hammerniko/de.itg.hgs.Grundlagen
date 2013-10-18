package P2_OOPProbearbeitUnidirektionaleAssoziation1ZuN;

import java.util.Vector;


public class Kunde {
	
	private String name;
	private String vorname;
	Vector <Auto> dieAutos;
	
	
	
	public Kunde(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
		dieAutos = new Vector <Auto>();
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
	
	public void add(Auto auto) {
		dieAutos.add(auto);
	}
	
	public void remove(Auto auto) {
		dieAutos.remove(auto);
	}
	
	public Auto get(int stelle){
		return dieAutos.get(stelle);
	}



	@Override
	public String toString() {
		return "Kunde [name=" + name + ", vorname=" + vorname + ", dieAutos="
				+ dieAutos + "]";
	}

}

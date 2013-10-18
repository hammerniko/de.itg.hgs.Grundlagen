package P2_OOPProbearbeitUnidirektionaleAssoziation1ZuN;


public class Startklasse {

	
	public static void main(String[] args) {
		Kunde fritz = new Kunde("Meier","Fritz");
	
		Auto m3 = new Auto("BMW", "M3");
		Auto porsche = new Auto("Prosche", "911");
		
		
		fritz.add(m3);
		fritz.add(porsche);
		
		
		
		System.out.println(fritz);
	}

}

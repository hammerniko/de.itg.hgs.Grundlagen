package P3a_BidirektionaleAssoziation1_n;

public class StartKlasse {
	
	public static void main(String[] args) {
		Mutter m = new Mutter();	
		Kind fritz = new Kind();
		Kind heinz = new Kind();
		
		m.addKind(fritz);
		heinz.setMutter(m);
	
	}
}

package I_Methoden;
public class Methoden {
	
	static int anzZahlen = 10;
	static int fakultaeten[]=new int[anzZahlen+1];
	static int quadriert[]=new int [anzZahlen+1];
	
	public static void erstelleTabelle(){
		for (int i = 0; i < anzZahlen; i++) {
			fakultaeten[i]=fakultaet(i);
			quadriert[i]=quadriere(i);
		}
	}
	
	public static void ausgabeTabelle(){
		for (int i = 1; i < anzZahlen; i++) {
			System.out.println(i+" \t"+fakultaeten[i]+" \t"+quadriert[i]);
		}
	}
		
	public static void main(String[] args) {
		erstelleTabelle();
		ausgabeTabelle();
	}
	
	
	public static int quadriere(int zahl){
		return zahl*zahl;
	}
	
	public static int fakultaet(int zahl){
		int erg=1;
		if(zahl>=1){
			//fakultät(3)=1*2*3
			for (int i = 2; i <= zahl; i++) {
				erg=erg*i;
			}
		}
		else{
			erg=-1;
		}
			
		return erg;
	}
	

}

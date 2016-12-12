package A6_Operatoren;

public class A65c_BinaeresXOR {

	public static void main(String[] args) {
		//Uebung XOR
	    //Welchen Wert hat z? 
	    int a=9;    	//1001
	    int b=3;     	//0011 
	    String str_a, str_b, str_z;
	    int anzahlBit = 4;
	    
	    //Verarbeitung
	    int z = a^b;	//0001
	    str_a=Integer.toBinaryString(a);
	    while (str_a.length()<anzahlBit) {
			str_a = "0"+str_a;
		}
	    
	    str_b=Integer.toBinaryString(b);
	    while (str_b.length()<anzahlBit) {
			str_b = "0"+str_b;
		}
	    
	    str_z=Integer.toBinaryString(z);
	    while (str_z.length()<anzahlBit) {
			str_z = "0"+str_z;
		}
	    
	    //ausgabe
	    System.out.println("Binaeres Exclusiv-ODER");
	    System.out.println("----------------------");
	    System.out.println("a = "+a+"\t= "+str_a);
	    System.out.println("b = "+b+"\t= "+str_b);
	    System.out.println("----------------------");
	    System.out.println("z = "+z+"\t= "+str_z);
	}
	 
}

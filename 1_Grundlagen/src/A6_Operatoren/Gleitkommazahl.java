package A6_Operatoren;

import java.util.Scanner;

public class Gleitkommazahl {

	public static void main(String[] args) {
		//Eingabe
				
		
				Scanner s = new Scanner(System.in);
				double dezimalzahl;
				int anzahlBits = 32;
				double anzahlBitsExponent = 8;
				double excess;
				int vkDezimal;
				double nkDezimal, z;
				String vkBinaer, nkBinaer="";
				
				System.out.print("Kommazahl:\t\t\t");
				dezimalzahl = s.nextDouble();
				
				//Verarbeitung
				excess =  Math.pow(2, anzahlBitsExponent-1)-1;
				vkDezimal = (int) dezimalzahl;
				vkBinaer = Integer.toBinaryString(vkDezimal);
				nkDezimal = Math.round((dezimalzahl-vkDezimal)*1000)/1000.0;
				
				//Nachkommastellen berechnen
				int anzahlBitsMantisse = (int) (anzahlBits-anzahlBitsExponent-1);
				
				//Rechenwert für Nachkommastellen
				z=nkDezimal;
				
				for (int i = 0; i < anzahlBitsMantisse; i++) {
					
					if(z*2 > 1){
						nkBinaer = nkBinaer +"1";
						z = z * 2 - 1; 
					}
					else{
						nkBinaer = nkBinaer +"0";
						z= z * 2;
					}
		}
				
				
				
				
				//Ausgabe
				System.out.println("Anzahl Bits: \t\t\t"+anzahlBits);
				System.out.println("Anzahl Bits im Exponent:\t"+(int) anzahlBitsExponent);
				System.out.println("Excess:\t\t\t\t"+(int) excess);
				System.out.println("Vorkommateil Binaer:\t\t"+vkBinaer);
				System.out.println("Nachkommateil Dez.:\t\t"+nkDezimal);
				System.out.println("Nachkommateil binaer:"+nkBinaer);
				

	}

}

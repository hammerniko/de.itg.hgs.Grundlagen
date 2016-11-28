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
				String vkBinaer, nkBinaer="", fkZahl="", normierteFkZahl="";
				int kommaNachLinksUm=0;
				int pos; //Position innerhalb der Nachkommastellen
				int erstePosMitEins = 0;
				boolean wurdeEinsGesetzt = false;
				
				System.out.print("Kommazahl: ");
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
				pos=0;
				
				for (int i = 0; i < anzahlBitsMantisse; i++) {
					
					if(z*2 > 1){
						nkBinaer = nkBinaer +"1";
						z = z * 2 - 1; 
						//Merke die Position der zuerst gesetzten Eins
						if(!wurdeEinsGesetzt){
							wurdeEinsGesetzt = true;
							erstePosMitEins = pos;
						}
					}
					else{
						nkBinaer = nkBinaer +"0";
						z= z * 2;
					}
					pos++;
			
				}
			    //Festkommazahl
				fkZahl = vkBinaer+","+nkBinaer;
				
				//normierte FK-Zahl
				if(vkDezimal>0){
					kommaNachLinksUm = vkBinaer.length()-1;
					System.out.println(vkBinaer.substring(1,vkBinaer.length()));
					
				}
				else{
					//nachkommateil nach links verschieben bis eine 1 kommt.
					kommaNachLinksUm = -(erstePosMitEins+1);
				}
				
				vkBinaer = "1";
			    
		
				
				
				
				
				//Ausgabe
				System.out.println("Anzahl Bits: "+anzahlBits);
				System.out.println("Anzahl Bits im Exponent: "+(int) anzahlBitsExponent);
				System.out.println("1.) Excess: "+(int) excess);
				System.out.println("2.) Vorkommateil Binaer: "+vkBinaer);
				System.out.println("3.) Nachkommateil Dez.: "+nkDezimal);
				System.out.println("4.) Nachkommateil binaer:"+nkBinaer);
				System.out.println("5.) Festkommazahl: "+fkZahl);
				System.out.println("6.) Kommaverschiebung um "+kommaNachLinksUm+" Stelle(n) nach links (neg. Werte nach rechts).");
				
				

	}

}

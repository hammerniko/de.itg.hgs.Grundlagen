

package B1_Verzweigungen;

public class B1_8_shift {

	public static void main(String[] args) {
		
		//Eingabe
		int a = 255;
		int b = 32;
		String meldung;
		
		//Verarbeitung
		if((a & a-1)==0){
			meldung =a+" ist eine 2er Potenz";
		}
		else{
			meldung="falscher Wert für a";
		}
		
		//Ausgabe
		System.out.println(meldung);
		
		
		
		
	}

}

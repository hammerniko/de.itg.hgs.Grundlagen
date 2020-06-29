package G4_AufgabenmitDatum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alter {

	public static void main(String[] args) {
		
		//Aktuelles Datum
		Calendar cal = new GregorianCalendar();
		int jahr = cal.get(Calendar.YEAR);
		int monat = cal.get(Calendar.MONTH);
		int tag = cal.get(Calendar.DAY_OF_MONTH);
				
		//variante 1
		String geburtsdatum = "03.04.2001";
				
		//variante 2
		int gebJahr=2001;
		int gebMonat=4;
		int gebTag=3;
		
		
        int alter1 = gibAlter(geburtsdatum);
		int alter2 = gibAlter(gebTag, gebMonat,gebJahr);
		
		

	}

	
	private static int gibAlter(String geburtsdatum) {
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		formatter.getCalendar(geburtsdatum);
		
		
		
		return 0;
	}
	
	private static int gibAlter(int pTag, int pMonat, int pJahr) {
		
		
		
		
		
		
		return 0;
	}

}

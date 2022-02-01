package G4_AufgabenmitDatum;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatumInTagMonatJahr {
	

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		int jahr = cal.get(Calendar.YEAR);
		int monat = cal.get(Calendar.MONTH);
	
		
		
		System.out.println(monat);

	}

}

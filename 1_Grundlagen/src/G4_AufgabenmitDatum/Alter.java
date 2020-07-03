package G4_AufgabenmitDatum;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alter {

	public static void main(String[] args) throws ParseException {
		//Eingabe
		String geburtsdatum = "03.04.2001";

		//Verarbeitung
		int alter = gibAlter(geburtsdatum);
		
		//Ausgabe
		System.out.println(alter);
		

	}

	private static int gibAlter(String geburtsdatum) throws ParseException {
		
		//Geburtsdatum
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date birthdate = formatter.parse(geburtsdatum);
		Calendar cal = new GregorianCalendar();
		cal.setTime(birthdate);

		int gebjahr = cal.get(Calendar.YEAR);
		int gebmonat = cal.get(Calendar.MONTH);
		int gebtag = cal.get(Calendar.DAY_OF_MONTH);

		// Aktuelles Datum
		Calendar calHeute = new GregorianCalendar();
		int jahr = calHeute.get(Calendar.YEAR);
		int monat = calHeute.get(Calendar.MONTH);
		int tag = calHeute.get(Calendar.DAY_OF_MONTH);
		
		//...bitte vervollständigen
		
		
		

		return 0;
	}

	private static int gibAlter(int pTag, int pMonat, int pJahr) {

		return 0;
	}

}

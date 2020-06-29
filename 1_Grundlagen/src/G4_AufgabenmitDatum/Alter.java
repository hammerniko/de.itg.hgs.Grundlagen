package G4_AufgabenmitDatum;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alter {

	public static void main(String[] args) throws ParseException {

		// Aktuelles Datum
		Calendar cal = new GregorianCalendar();
		int jahr = cal.get(Calendar.YEAR);
		int monat = cal.get(Calendar.MONTH);
		int tag = cal.get(Calendar.DAY_OF_MONTH);

		// variante 1
		String geburtsdatum = "03.04.2001";

		// variante 2
		int gebJahr = 2001;
		int gebMonat = 4;
		int gebTag = 3;

		int alter1 = gibAlter(geburtsdatum);
		int alter2 = gibAlter(gebTag, gebMonat, gebJahr);

	}

	private static int gibAlter(String geburtsdatum) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date date = formatter.parse(geburtsdatum);

		Calendar cal = new GregorianCalendar();
		cal.setTime(date);

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

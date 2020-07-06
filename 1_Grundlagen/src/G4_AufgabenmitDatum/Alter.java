package G4_AufgabenmitDatum;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alter {

	public static void main(String[] args) throws ParseException {
		// Eingabe
		String geburtsdatum = "06.07.2000";

		// Verarbeitung
		int alter = gibAlter(geburtsdatum);

		// Ausgabe
		System.out.println(alter);
	}

	private static int gibAlter(String geburtsdatum) throws ParseException {
		// Geburtsdatum
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date birthdate = formatter.parse(geburtsdatum);
		Calendar calGeb = new GregorianCalendar();
		calGeb.setTime(birthdate);

		int gebjahr = calGeb.get(Calendar.YEAR);
		int gebmonat = calGeb.get(Calendar.MONTH)+1;
		int gebtag = calGeb.get(Calendar.DAY_OF_MONTH);
		
		
		

		// Aktuelles Datum
		Calendar calHeute = new GregorianCalendar();
		int jahr = calHeute.get(Calendar.YEAR);
		int monat = calHeute.get(Calendar.MONTH)+1;
		int tag = calHeute.get(Calendar.DAY_OF_MONTH);
		
		//Testausgabe
		System.out.println("Geb Datum:"+gebtag+"."+gebmonat+"."+gebjahr);
		System.out.println("Heute:"+tag+"."+monat+"."+jahr);

		// Prüfen auf Gültigkeit
		if (gebjahr > jahr) {
			System.out.println("Jahr ungültig");
			return -1;
		}

		if (monat < 1 || monat > 12) {
			System.out.println("Monat ungültig");
			return -1;
		}

		if (tag < 1 || tag > 31) {
			System.out.println("Tag ungültig");
			return -1;
		}

		// Alter bestimmen
		int alter;
		
		if(gebmonat<monat) {
			alter = jahr-gebjahr;
		}
		else if(gebmonat>monat) {
			alter = jahr-gebjahr-1;
		}
		else {
			if(gebtag>tag) {
				alter = jahr-gebjahr-1;
			}
			else {
				alter = jahr-gebjahr;
			}
		}

		
		
		return alter;
	}

}

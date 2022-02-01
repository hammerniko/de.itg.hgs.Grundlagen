package G4_AufgabenmitDatum;

import java.time.LocalDate;
import java.time.Period;

public class AlterMitLocalDate {

	public static void main(String[] args) {
		LocalDate geburtsDatum = LocalDate.of(2001,2,5);
		int alter =  gibAlter(geburtsDatum);
		System.out.println(alter);
	}
	
	public static int gibAlter(LocalDate datum) {
		LocalDate dheute = LocalDate.now();
		
		
		Period period = Period.between(datum, dheute);
		int alter = period.getYears();
		
		return alter;
		
	}

}

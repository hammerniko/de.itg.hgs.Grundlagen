package G4_AufgabenmitDatum;

import java.time.LocalDate;
import java.time.Period;

public class AlterMitLocalDate {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1968,12,16);
		System.out.println( gibAlter(d1));
	}
	
	
	public static int gibAlter(LocalDate datum) {
		LocalDate dheute = LocalDate.now();

		Period period = Period.between(datum, dheute);
		int alter = period.getYears();
		
		return alter;
	}

}

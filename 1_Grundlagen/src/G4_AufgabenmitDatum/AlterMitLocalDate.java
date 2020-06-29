package G4_AufgabenmitDatum;

import java.time.LocalDate;
import java.time.Period;

public class AlterMitLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.of(1968,12,16);
		LocalDate d2 = LocalDate.now();

		Period period = Period.between(d1, d2);
		int alter = period.getYears();
		
		System.out.println( alter);
	}

}

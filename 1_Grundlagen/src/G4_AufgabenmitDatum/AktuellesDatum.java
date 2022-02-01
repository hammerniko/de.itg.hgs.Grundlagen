package G4_AufgabenmitDatum;

import java.util.*;
import java.text.*;

public class AktuellesDatum {

	public static void main(String[] args) {
		
			
		System.out.println(getDateAsString());

		Date dt1;
		try {

			String input_date = "01/02/2022";
			SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
			dt1 = format1.parse(input_date);
			DateFormat format2 = new SimpleDateFormat("EEEE");
			String finalDay = format2.format(dt1);
			System.out.println(finalDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static String getDateAsString() {
		DateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy");
		return formatter.format(new Date());
	}

}

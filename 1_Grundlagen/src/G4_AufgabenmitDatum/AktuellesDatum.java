package G4_AufgabenmitDatum;

import java.util.*;
import java.text.*;

public class AktuellesDatum {

	public static void main(String[] args) {
		System.out.println(getDateAsString());

	}
	

	public static String getDateAsString() {
	   DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
	   return formatter.format(new Date());
	}
	
	

}

package G4_AufgabenmitDatum;
import java.util.*;

import D1_Arrays.Getraenkeautomat;

import java.text.*;


public class StringInDatum {

	public static void main(String[] args) throws ParseException {
		
		
        String dateInString = "7.Jun.2013";
        
        Date datum = getDate(dateInString);
        
        printDate(datum);
       

	}
	
	public static Date getDate(String strDatum) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy");
		Date date = formatter.parse(strDatum);
      
        return date;
        
	}
	
	public static void printDate(Date datum) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy");
		System.out.println(formatter.format(datum));
	}

}

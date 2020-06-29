package G4_AufgabenmitDatum;
import java.util.*;
import java.text.*;


public class StringInDatum {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy");
        String dateInString = "7.Jun.2013";
        
		Date date = formatter.parse(dateInString);
        System.out.println(date);
        System.out.println(formatter.format(date));
        
        

	}

}

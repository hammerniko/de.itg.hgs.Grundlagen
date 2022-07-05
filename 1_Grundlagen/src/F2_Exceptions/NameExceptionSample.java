package F2_Exceptions;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class NameExceptionSample {
	
	static String name="-";

	public static void main(String[] args) {
		//Eingabe
		Scanner s = new Scanner(System.in);
		System.out.println("Name:");
		
		try {
			setName(s.next());
		} catch (NameLengthException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Bitte mind 3 Zeichen angeben");
		}
		System.out.println("Hallo: "+name);
	}

	private static void setName(String pName) throws NameLengthException{
		if(pName.length()>=3) {
			name = pName;
		}
		else {
			throw new NameLengthException();
		}
	}
}



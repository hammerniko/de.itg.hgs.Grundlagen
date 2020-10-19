package P_Seriealisieren;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializeObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7507585085783455597L;
	int nummer;
	String name;

	public TestSerializeObject(int nummer, String name) {
		this.nummer = nummer;
		this.name = name;
	}

	public static void main(String[] args) {
		
		//testobjekt erzeugen
		TestSerializeObject t1 = new TestSerializeObject(1, "Max");
		
		//Objekt speichern
		try {
			
			//Evtl Pfad angeben
			File file = new File("meineTestObjekte.to");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t1);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

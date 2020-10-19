package P_Seriealisieren;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		
		//Objekt speichern und laden
		try {
			
			//Evtl Pfad angeben
			File file = new File("src//P_Seriealisieren//meineTestObjekte.to");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t1);
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			TestSerializeObject loaded = (TestSerializeObject) ois.readObject();
			
			System.out.println(loaded.nummer);
			System.out.println(loaded.name);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}

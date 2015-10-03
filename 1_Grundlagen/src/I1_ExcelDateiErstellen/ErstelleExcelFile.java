package I1_ExcelDateiErstellen;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Um apache poi zu verwenden, muss von der Website Apache Poi die aktuelle bin-Version heruntergeladen werden.
 * Im Zip Archiv ist dann die benötigte JAR-Datei. Diese muss als externe JAR in das Projekt 
 * eingebunden werden.
 * @author nh
 *
 */
public class ErstelleExcelFile {

	public static void main(String[] args) {
		//Excel Arbeitsmappe erstellen
		HSSFWorkbook wb = new HSSFWorkbook();
		
		//Register in der Mappe erstellen
		Sheet blatt = wb.createSheet("Mein Blatt");
		
		try {			
			//Ausgabedatenstrom erzeugen und Dateipfad erzeugen
			FileOutputStream outputStream  = new FileOutputStream("src/I1_EXCEL/Excel.xls");
			
			//Datei erzeugen
			wb.write(outputStream);
			
			//Ausgabestrom wieder schliessen
			outputStream.close();
		} catch (Exception e) {
			//vereinfachte Fehlermeldung, wenn etwas schief geht
			System.out.println("IO Fehler");
		}

	}

}

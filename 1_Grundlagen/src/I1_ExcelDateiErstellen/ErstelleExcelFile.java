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
		HSSFWorkbook wb = new HSSFWorkbook();
		Sheet blatt = wb.createSheet("Mein Blatt");
		
		try {
			FileOutputStream outputStream  = new FileOutputStream("src/I1_EXCEL/Excel.xls");
			wb.write(outputStream);
			outputStream.close();
		} catch (Exception e) {
			System.out.println("IO Fehler");
		}

	}

}

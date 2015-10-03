package I2_ExcelWertInZelleSchreiben;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Um apache poi zu verwenden, muss von der Website Apache Poi die aktuelle bin-Version heruntergeladen werden.
 * Im Zip Archiv ist dann die benötigte JAR-Datei. Diese muss als externe JAR in das Projekt 
 * eingebunden werden.
 * @author nh
 *
 */
public class SchreibeWertInExcelFile {

	public static void main(String[] args) {
		HSSFWorkbook wb = new HSSFWorkbook();
		Sheet blatt = wb.createSheet("Mein Blatt");
		
		//Zelle erstellen und Wert reinschreiben
		Row row = blatt.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue(3.1415);
		
		Cell cell2 = row.createCell(1);
		cell2.setCellValue(2);
		
		Cell cell3= row.createCell(2);
		cell3.setCellFormula("A1*B1");
		
		
		
		try {			
			FileOutputStream outputStream  = new FileOutputStream("src/I2_EXCELWertInZelleSchreiben/Excel.xls");
			wb.write(outputStream);
			outputStream.close();
		} catch (Exception e) {
			System.out.println("IO Fehler");
		}
	}

}

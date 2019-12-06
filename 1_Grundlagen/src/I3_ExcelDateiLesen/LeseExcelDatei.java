package I3_ExcelDateiLesen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

public class LeseExcelDatei {

	public static void main(String[] args) {
		
		//Dateiauswahldialog anzeigen
		JFileChooser fc = new JFileChooser();
		int auswahl = fc.showOpenDialog(null);
		
		//Wenn Oeffnen geklickt wurde
		if(auswahl == JFileChooser.APPROVE_OPTION){
			try {
				//ausgewähltes File einlesen
				HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(fc.getSelectedFile()));
				
				//erstes Tabellenblatt holen
				Sheet blatt = wb.getSheetAt(0);
				
				//Alle Zellen des Tabellenblatts auf Konsole ausgeben
				for(Row reihe : blatt){
					for(Cell zelle : reihe){
						//zelle.setCellType(Cell.CELL_TYPE_STRING);
						System.out.print("\t"+zelle.getStringCellValue());
					}
					System.out.println();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

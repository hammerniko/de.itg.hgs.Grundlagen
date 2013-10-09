package H1_Datenbanken;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ZugriffAufAccess extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollTable = null;

	public ZugriffAufAccess() {
		super();
		initialize();
		aktualisiereTabelle("Select * From Kunden");
	}

	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Access mit Java");
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJScrollTable(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	private JScrollPane getJScrollTable() {
		if (jScrollTable == null) {
			jScrollTable = new JScrollPane();
		}
		return jScrollTable;
	}
	
	 private void aktualisiereTabelle(String q) {
		 	setTitle(q);
	        Vector columnNames = new Vector();
	        Vector data = new Vector();
	        try{
	            Connection con = connectDB("Users/nikolaihammer/Dropbox/HGS/Statistik/ITC-2000.mdb");
	            
	            //Abfrage definieren
	            String query = q;
	            System.out.println(query);
                 
	            
	            Statement stmt = con.createStatement();
	            ResultSet rst = stmt.executeQuery(query);
	            ResultSetMetaData md = rst.getMetaData();
	            int columns = md.getColumnCount();
	            
	            //  Spaltennamen ermitteln
	            for (int i = 1; i <= columns; i++) {
	                String colname=md.getColumnName(i);
	                columnNames.addElement( colname);
	                
	            }
	            //  Zeileninhalt ermitteln
	            while (rst.next()) {
	                Vector row = new Vector(columns);
	                for (int i = 1; i <= columns; i++) {
	                    row.addElement( rst.getObject(i) );
	                }
	                data.addElement( row );
	            }
	            rst.close();
	            stmt.close();
                 
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	        // Tabelle erzeugen
	        JTable table = new JTable(data, columnNames);
	        jScrollTable.setViewportView(table);
             System.out.print(columnNames.toString());
	    }

    private Connection connectDB(String pURL_DB) throws ClassNotFoundException, SQLException {
        //Datenbankverbindung herstellen
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection( 
                 "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};" +
                 "DBQ="+pURL_DB,"","" );
         
        System.out.println("Connection Successful ");
        return con;
    }
 

}

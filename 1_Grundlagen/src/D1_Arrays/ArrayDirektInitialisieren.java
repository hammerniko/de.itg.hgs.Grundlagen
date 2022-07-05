package D1_Arrays;

public class ArrayDirektInitialisieren {

	public static void main(String[] args) {

		// Eingabe
		// Direkte initialisierung
		String name[] = {"Mueller","Meier","Schmid"};

		
		//Indirekte Initialisierung
		String[] vorname = new String[3];
		vorname[0]="Max";
		vorname[1]="Moritz";
		vorname[3]="Fritz";
		
		
		
		
		vorname[2] = "Detlef";
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" "+vorname[i]+"\n");
		}

	}

}

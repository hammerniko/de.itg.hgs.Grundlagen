package D1_Arrays;

/**
 * Um eine Kommunikation einfach zu verschlüsseln, wird eine Code Tabelle
 * verwendet. In der Methode iniCodes() wird diese initialisiert.
 * Die Methode ausgabeCodes() gibt die Codetabelle aus.
 * Sowohl Sender als auch Empfänger müssen die gleich Codetabelle verwenden.
 * 
 * Eine mit Codes codierte Nachricht welche als Text existiert
 * soll mit der Methode ausgabeNachricht mithilfe der codes decodiert und ausgegeben werden.
 * 
 * @author hr
 *
 */
public class RotiereCodeTabelle {

	static String[][] codes = new String[3][3];

	public static void main(String[] args) {

		initCodes();
		ausgabeCodes();

		String nachricht = "Daniel 00 Singen und 01 Fritz";
		ausgabeNachricht(nachricht);

	}

	private static void ausgabeNachricht(String nachricht) {
		for (int i = 0; i < codes.length; i++) {
			for (int j = 0; j < codes.length; j++) {

				String codeStr = "" + i + "" + j;

				// wenn ein Code in der Nachricht enthalten ist
				if (nachricht.contains(codeStr)) {
					String decoded = codes[j][i];
					nachricht = nachricht.replaceAll(codeStr, decoded);
				}
			}
		}

		System.out.println(nachricht);

	}

	private static void rotateCodes() {
		String[][] codesNeu = new String[3][3];

		for (int x = 0; x < codesNeu.length; x++) {
			for (int y = 0; y < codesNeu.length; y++) {
				codesNeu[x][y] = codes[y][2 - x];
			}

		}

		codes = codesNeu;
		codesNeu = null;
	}

	private static void ausgabeCodes() {
		for (int i = 0; i < codes.length; i++) {
			System.out.println();
			for (int j = 0; j < codes.length; j++) {
				System.out.print(i + "" + j + " " + codes[j][i] + "\t");
			}
		}
		System.out.println("\n---------------------------------------------------------");

	}

	private static void initCodes() {
		codes[0][0] = "gehe zu Ort        ";
		codes[0][1] = "warte Minuten      ";
		codes[0][2] = "gehe zu Koordinate ";
		codes[1][0] = "melde Dich bei     ";
		codes[1][1] = "benötige Material  ";
		codes[1][2] = "bringe Material    ";
		codes[2][0] = "bin verhindert weil";
		codes[2][1] = "bin bei Koordinate ";
		codes[2][2] = "habe gerade gesehen";
	}

}

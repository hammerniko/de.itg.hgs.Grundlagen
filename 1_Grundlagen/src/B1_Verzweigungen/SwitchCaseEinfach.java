package B1_Verzweigungen;

public class SwitchCaseEinfach {

	public static void main(String[] args) {

		int monat = 0;
		int anzahlTageDerMonate = 0;

		monat = 4;

		switch (monat) {
		case 4: anzahlTageDerMonate += 31;
		case 3:
			anzahlTageDerMonate += 28;
		case 2:
			anzahlTageDerMonate += 31;
		case 1:

			break;

		}

		System.out.println(anzahlTageDerMonate);

	}
}

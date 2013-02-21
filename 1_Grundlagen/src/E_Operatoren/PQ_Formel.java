package E_Operatoren;

public class PQ_Formel {
	
	public static void main	(String[] argv){
		
		//Komandozeilenparameter überprüfen und ggf. a,b,c definieren
		if (argv.length!=3)	System.out.println("Bitte die Koeffizienten (a, b, c) des Polynoms angeben");
		else {
			double a= Double.parseDouble(argv[0]);
			double b= Double.parseDouble(argv[1]);
			double c= Double.parseDouble(argv[2]);
			/** Wenn der erste Koeffizient a=0 handelt es sich nicht mehr um ein Polynom zweiten Grades*/
			if (a!=0) pq(a,b,c); //berechnung
			else {
				/** Wenn die ersten beiden Koeefizienten Null sind handelt es sich um ein Polynom nullten Grades*/
				if (b!=0) System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDie Nullstele des eingegeben Polynoms ist: \n x=" + ((-1)*c/b)); //Berechnung Inclusive
				else {
					if (c!=0) System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDieses Polynom nullten Grades besitzt keine Nullstelle!"); //Berechnung an dieser Stelle wäre mathematisch blöd
					else System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDieses Polynom ist das Nullpolynom"); //hier auch
				}
			}
		}
	}
	/** Nullstellenberechnung für ein Polynom zweiten Grades*/
	public static void pq (double a, double b, double c){
		double minuspHalbe =(-1)*b*0.5/a;
		double diskriminante = minuspHalbe*minuspHalbe - c/a;
		if (diskriminante>0) System.out.println("Dieses Polynom besitzt zwei Nullstellen: \n x1=" + (minuspHalbe-Math.sqrt(diskriminante)) + "\n x2=" + (minuspHalbe+Math.sqrt(diskriminante)));
		else {
			if (diskriminante<0) System.out.println("Dieses Polynom hat keine Nullstellen im reellen Zahlenraum"); //Die Wurzel aus Negativen in R nicht möglich
			else System.out.println("Dieses Polynom besitzt nur eine Nullstelle: \n x=" + minuspHalbe);	//Ausnahmefall, wenn die Wurzel null ist
		}
	
	}
}


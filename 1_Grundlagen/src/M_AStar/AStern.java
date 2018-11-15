package M_AStar;

import java.util.ArrayList;

public class AStern {

	static ArrayList<Knoten> openList;
	static ArrayList<Knoten> closedList;

	public static void main(String[] args) {
		
		//Suchfeld festlegen als Gitter
		//Start und Ziel wird definiert
		//Pfadkosten gerade = 10, diagonal = 14
		initGrid();
		
		//openList und closedList für A* erzeugen
		initLists();
		
		
		
		
		

	}

	public static void initLists() {
		openList = new ArrayList<Knoten>();
		closedList = new ArrayList<Knoten>();
	}

	public static void initGrid() {
		// Spielfeld, Gitter erzeugen
		Grid grid = new Grid(9, 9);

		// Hindernisse setzen
		grid.addHindernis(4, 1);
		grid.addHindernis(4, 2);
		grid.addHindernis(4, 3);

		grid.addHindernis(2, 5);
		grid.addHindernis(2, 6);

		grid.addHindernis(5, 6);
		grid.addHindernis(5, 7);
		grid.addHindernis(5, 8);

		// Start- und ZIelknoten festlegen
		grid.setStart(new Knoten(1, 1, null));
		grid.setZiel(new Knoten(7, 6, null));

		// Grid ausgeben
		grid.ausgabeGrid();

	}

}
package X_PrisonersDilemma;


import java.util.ArrayList;

//TRUE => VERRATEN
//FALSE => GEDECKT
public class Prisoner_DQ extends Prisoner {
	int durchlauf = 0;

	public boolean entscheidung(boolean[] ich, boolean[] gegner) {
		if (durchlauf > 3) {
			durchlauf++;

			int RandomZahl = (int) (Math.random() * 10 + 1); // 50:50 ob Intelligenz oder Random
			if (RandomZahl <= 2) // FÜR DIE RANDOMNESS: FALLS 1 ODER 2, VERRATE GEGNER! p = 20%
				return true;
			if (RandomZahl >= 7) // FÜR DIE RANDOMNESS: FALLS 7, 8, 9 ODER 10, DECKE GEGNER! p = 40%
				return false;

			if (ich[durchlauf - 2] && gegner[durchlauf - 2]) { // BEIDE VERRATEN -> KEIN PUNKT :(
				if (gegner.length > 1) {
					if (gegner[durchlauf - 3] && ich[durchlauf - 3]) { // VORHER AUCH BEIDE VERRATEN? VERRATE IHN!
						return true;
					} else if (!gegner[durchlauf - 3]) { // ER HAT MICH VORHER NICHT VERRATEN? DECKE IHN!
						return false;
					} else if (gegner[durchlauf - 3] && !ich[durchlauf - 3]) { // ER HAT MICH VORHER VERRATEN, WÄHREND
																				// ICH IHN GEDECKT HABE? DECKE IHN!
						return false;
					}
				}
			}

			if (!ich[durchlauf - 2] && gegner[durchlauf - 2]) { // ICH VERRATE NICHT, GEGNER VERRÄT -> ZWEI FÜR GEGNER!
				if (gegner.length > 1) {
					if (gegner[durchlauf - 3] && ich[durchlauf - 3]) { // VORHER AUCH BEIDE VERRATEN? VERRATE IHN!
						return true;
					} else if (!gegner[durchlauf - 3]) { // ER HAT MICH VORHER NICHT VERRATEN? DECKE IHN!
						return false;
					} else if (gegner[durchlauf - 3] && !ich[durchlauf - 3]) { // ER HAT MICH VORHER VERRATEN, WÄHREND
																				// ICH IHN GEDECKT HABE? DECKE IHN!

						int rndm = (int) (Math.random() * 3 + 1);
						if (rndm > 1)
							return true;
					}
				}
			}

			if (!ich[durchlauf - 2] && !gegner[durchlauf - 2]) { // BEIDE DECKEN -> BEIDE BEKOMMEN PUNKT!
				if (RandomZahl > 5) // KANN 6 sein! p = 10%
					return true;
				if (gegner.length > 1) {
					if (ich[durchlauf - 3] && gegner[durchlauf - 3])
						return true;
					if (!ich[durchlauf - 3] && gegner[durchlauf - 3])
						return false;
					if (!ich[durchlauf - 3] && !gegner[durchlauf - 3])
						return true;
					if (ich[durchlauf - 3] && !gegner[durchlauf - 3])
						return false;

				}

			}

		}
		durchlauf++;
		return false;
	}
}

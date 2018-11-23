package m226b.ifz724004a.tictactoe;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Erbt von KI da die schwere KI ja auch eine KI ist
 	 * Ist für die SChwere KI zuständig
 	 */

public class DifficultKI extends KI{
	/**
	 * kiDifficultTurn:
	 * Die Schwere KI konntrolliert ob sie gewinnen kann und falls nicht überprüft sie ob der Gegner gewinnen kann und verhindert das
	 * Falls niemand gewinnen kann wählt die MEthode ein random feld aus
	 */
	public void kiDifficultTurn(String[][] fields) {
		// GEWINNEN

		// VERTIKAL

		// SPALTE LINKS
		// falls feld 4 und feld 1 gleich O und feld 7 gleich leer setz O auf feld 7
		if (fields[0][1].matches(" O ") && fields[0][2].matches(" O ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// falls feld 7 und feld 1 gleich O und feld 4 gleich leer setz O auf feld 4
		else if (fields[0][0].matches(" O ") && fields[0][2].matches(" O ") && fields[0][1].matches("   ")) {
			fields[0][1] = " O ";
		}

		// falls feld 7 und feld 4 gleich O und feld 1 gleich leer setz O auf feld 1
		else if (fields[0][0].matches(" O ") && fields[0][1].matches(" O ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// SPALTE MITTE
		// falls feld 5 und feld 2 gleich O und feld 8 gleich leer setz O auf feld 8
		else if (fields[1][1].matches(" O ") && fields[1][2].matches(" O ") && fields[1][0].matches("   ")) {
			fields[1][0] = " O ";
		}

		// falls feld 8 und feld 2 gleich O und feld 5 gleich leer setz O auf feld 5
		else if (fields[1][0].matches(" O ") && fields[1][2].matches(" O ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 8 und feld 5 gleich O und feld 2 gleich leer setz O auf feld 2
		else if (fields[1][0].matches(" O ") && fields[1][1].matches(" O ") && fields[1][2].matches("   ")) {
			fields[1][2] = " O ";
		}

		// SPALTE RECHTS
		// falls feld 6 und feld 3 gleich O und feld 9 gleich leer setz O auf feld 9
		else if (fields[2][1].matches(" O ") && fields[2][2].matches(" O ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}

		// falls feld 9 und feld 3 gleich O und feld 6 gleich leer setz O auf feld 6
		else if (fields[2][0].matches(" O ") && fields[2][2].matches(" O ") && fields[2][1].matches("   ")) {
			fields[2][1] = " O ";
		}

		// falls feld 9 und feld 6 gleich O und feld 3 gleich leer setz O auf feld 3
		else if (fields[2][0].matches(" O ") && fields[2][1].matches(" O ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}


		// HORIZONTAL

		// ZEILE OBEN
		// falls feld 8 und feld 9 gleich O und feld 7 gleich leer setz O auf feld 7
		else if (fields[1][0].matches(" O ") && fields[2][0].matches(" O ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// falls feld 7 und feld 9 gleich O und feld 8 gleich leer setz O auf feld 8
		else if (fields[0][0].matches(" O ") && fields[2][0].matches(" O ") && fields[1][0].matches("   ")) {
			fields[1][0] = " O ";
		}

		// falls feld 7 und feld 8 gleich O und feld 9 gleich leer setz O auf feld 9
		else if (fields[0][0].matches(" O ") && fields[1][0].matches(" O ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}

		// ZEILE MITTE
		// falls feld 5 und feld 6 gleich O und feld 4 gleich leer setz O auf feld 4
		else if (fields[1][1].matches(" O ") && fields[2][1].matches(" O ") && fields[0][1].matches("   ")) {
			fields[0][1] = " O ";
		}

		// falls feld 4 und feld 6 gleich O und feld 5 gleich leer setz O auf feld 5
		else if (fields[0][1].matches(" O ") && fields[2][1].matches(" O ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 4 und feld 5 gleich O und feld 6 gleich leer setz O auf feld 6
		else if (fields[0][1].matches(" O ") && fields[1][1].matches(" O ") && fields[2][1].matches("   ")) {
			fields[2][1] = " O ";
		}

		// ZEILE UNTEN
		// falls feld 2 und feld 3 gleich O und feld 1 gleich leer setz O auf feld 1
		else if (fields[1][2].matches(" O ") && fields[2][2].matches(" O ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// falls feld 1 und feld 3 gleich O und feld 2 gleich leer setz O auf feld 2
		else if (fields[0][2].matches(" O ") && fields[2][2].matches(" O ") && fields[1][2].matches("   ")) {
			fields[1][2] = " O ";
		}

		// falls feld 1 und feld 2 gleich O und feld 3 gleich leer setz O auf feld 3
		else if (fields[0][2].matches(" O ") && fields[1][2].matches(" O ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}


		// DIAGONAL

		// LINKS OBEN NACH RECHTS UNTEN
		// falls feld 5 und feld 7 gleich O und feld 3 gleich leer setz O auf feld 3
		else if (fields[1][1].matches(" O ") && fields[0][0].matches(" O ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}

		// falls feld 3 und feld 7 gleich O und feld 5 gleich leer setz O auf feld 5
		else if (fields[2][2].matches(" O ") && fields[0][0].matches(" O ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 3 und feld 5 gleich O und feld 7 gleich leer setz O auf feld 7
		else if (fields[2][2].matches(" O ") && fields[1][1].matches(" O ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// RECHTS OBEN NACH LINKS UNTEN
		// falls feld 5 und feld 9 gleich O und feld 1 gleich leer setz O auf feld 1
		else if (fields[1][1].matches(" O ") && fields[2][0].matches(" O ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// falls feld 1 und feld 9 gleich O und feld 5 gleich leer setz O auf feld 5
		else if (fields[0][2].matches(" O ") && fields[2][0].matches(" O ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 1 und feld 5 gleich O und feld 9 gleich leer setz O auf feld 9
		else if (fields[0][2].matches(" O ") && fields[1][1].matches(" O ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}


		// GEGNER BLOCKIEREN

		// VERTIKAL

		// SPALTE LINKS
		// falls feld 4 und feld 1 gleich X und feld 7 gleich leer setz O auf feld 7
		else if (fields[0][1].matches(" X ") && fields[0][2].matches(" X ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// falls feld 7 und feld 1 gleich X und feld 4 gleich leer setz O auf feld 4
		else if (fields[0][0].matches(" X ") && fields[0][2].matches(" X ") && fields[0][1].matches("   ")) {
			fields[0][1] = " O ";
		}

		// falls feld 7 und feld 4 gleich X und feld 1 gleich leer setz O auf feld 1
		else if (fields[0][0].matches(" X ") && fields[0][1].matches(" X ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// SPALTE MITTE
		// falls feld 5 und feld 2 gleich X und feld 8 gleich leer setz O auf feld 8
		else if (fields[1][1].matches(" X ") && fields[1][2].matches(" X ") && fields[1][0].matches("   ")) {
			fields[1][0] = " O ";
		}

		// falls feld 8 und feld 2 gleich X und feld 5 gleich leer setz O auf feld 5
		else if (fields[1][0].matches(" X ") && fields[1][2].matches(" X ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 8 und feld 5 gleich X und feld 2 gleich leer setz O auf feld 2
		else if (fields[1][0].matches(" X ") && fields[1][1].matches(" X ") && fields[1][2].matches("   ")) {
			fields[1][2] = " O ";
		}

		// SPALTE RECHTS
		// falls feld 6 und feld 3 gleich X und feld 9 gleich leer setz O auf feld 9
		else if (fields[2][1].matches(" X ") && fields[2][2].matches(" X ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}

		// falls feld 9 und feld 3 gleich X und feld 6 gleich leer setz O auf feld 6
		else if (fields[2][0].matches(" X ") && fields[2][2].matches(" X ") && fields[2][1].matches("   ")) {
			fields[2][1] = " O ";
		}

		// falls feld 9 und feld 6 gleich X und feld 3 gleich leer setz O auf feld 3
		else if (fields[2][0].matches(" X ") && fields[2][1].matches(" X ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}


		// HORIZONTAL

		// ZEILE OBEN
		// falls feld 8 und feld 9 gleich X und feld 7 gleich leer setz O auf feld 7
		else if (fields[1][0].matches(" X ") && fields[2][0].matches(" X ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// falls feld 7 und feld 9 gleich X und feld 8 gleich leer setz O auf feld 8
		else if (fields[0][0].matches(" X ") && fields[2][0].matches(" X ") && fields[1][0].matches("   ")) {
			fields[1][0] = " O ";
		}

		// falls feld 7 und feld 8 gleich X und feld 9 gleich leer setz O auf feld 9
		else if (fields[0][0].matches(" X ") && fields[1][0].matches(" X ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}

		// ZEILE MITTE
		// falls feld 5 und feld 6 gleich X und feld 4 gleich leer setz O auf feld 4
		else if (fields[1][1].matches(" X ") && fields[2][1].matches(" X ") && fields[0][1].matches("   ")) {
			fields[0][1] = " O ";
		}

		// falls feld 4 und feld 6 gleich X und feld 5 gleich leer setz O auf feld 5
		else if (fields[0][1].matches(" X ") && fields[2][1].matches(" X ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 4 und feld 5 gleich X und feld 6 gleich leer setz O auf feld 6
		else if (fields[0][1].matches(" X ") && fields[1][1].matches(" X ") && fields[2][1].matches("   ")) {
			fields[2][1] = " O ";
		}

		// ZEILE UNTEN
		// falls feld 2 und feld 3 gleich X und feld 1 gleich leer setz O auf feld 1
		else if (fields[1][2].matches(" X ") && fields[2][2].matches(" X ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// falls feld 1 und feld 3 gleich X und feld 2 gleich leer setz O auf feld 2
		else if (fields[0][2].matches(" X ") && fields[2][2].matches(" X ") && fields[1][2].matches("   ")) {
			fields[1][2] = " O ";
		}

		// falls feld 1 und feld 2 gleich X und feld 3 gleich leer setz O auf feld 3
		else if (fields[0][2].matches(" X ") && fields[1][2].matches(" X ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}


		// DIAGONAL

		// LINKS OBEN NACH RECHTS UNTEN
		// falls feld 5 und feld 7 gleich X und feld 3 gleich leer setz O auf feld 3
		else if (fields[1][1].matches(" X ") && fields[0][0].matches(" X ") && fields[2][2].matches("   ")) {
			fields[2][2] = " O ";
		}

		// falls feld 3 und feld 7 gleich X und feld 5 gleich leer setz O auf feld 5
		else if (fields[2][2].matches(" X ") && fields[0][0].matches(" X ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 3 und feld 5 gleich X und feld 7 gleich leer setz O auf feld 7
		else if (fields[2][2].matches(" X ") && fields[1][1].matches(" X ") && fields[0][0].matches("   ")) {
			fields[0][0] = " O ";
		}

		// RECHTS OBEN NACH LINKS UNTEN
		// falls feld 5 und feld 9 gleich X und feld 1 gleich leer setz O auf feld 1
		else if (fields[1][1].matches(" X ") && fields[2][0].matches(" X ") && fields[0][2].matches("   ")) {
			fields[0][2] = " O ";
		}

		// falls feld 1 und feld 9 gleich X und feld 5 gleich leer setz O auf feld 5
		else if (fields[0][2].matches(" X ") && fields[2][0].matches(" X ") && fields[1][1].matches("   ")) {
			fields[1][1] = " O ";
		}

		// falls feld 1 und feld 5 gleich X und feld 9 gleich leer setz O auf feld 9
		else if (fields[0][2].matches(" X ") && fields[1][1].matches(" X ") && fields[2][0].matches("   ")) {
			fields[2][0] = " O ";
		}
		
		else {
			super.kiBasicTurn(fields);
		}
	}
}
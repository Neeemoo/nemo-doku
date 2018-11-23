package m226b.ifz724004a.tictactoe;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Diese Klasse bietet den Klassen EasyKI und DifficultKI die Methode für das generieren eines random feldes an
 	 */

public class KI {
	/**
	 * kiBasicTurn:
	 * Die methode heisst kiBasicTurn ist weil es eifach ein Random verfügbares Feld auswählt und darauf ein O setzt
	 * @param fields ist das board welches es braucht
	 */
	public void kiBasicTurn(String[][] fields) {
		int kiZug;
		int x = 0; 
		int y = 0;
		
		do {
			kiZug = (int) (Math.random() * ((9 - 1) + 1)) + 1;
			switch (kiZug) {
				case 1 : x = 2; y = 0; break;
				case 2 : x = 2; y = 1; break;
				case 3 : x = 2; y = 2; break;
				case 4 : x = 1; y = 0; break;
				case 5 : x = 1; y = 1; break;
				case 6 : x = 1; y = 2; break;
				case 7 : x = 0; y = 0; break;
				case 8 : x = 0; y = 1; break;
				case 9 : x = 0; y = 2; break;
			}
		} while (fields[x][y].matches(" X ") || fields[x][y].matches(" O "));
		
		fields[x][y] = " O ";
	}
}
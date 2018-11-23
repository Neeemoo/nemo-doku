package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Die Klasse Player nimmt die benutzereingaben auf und führt diese aus
 	 */

public class Player {
	
	/**
	 * playTurn:
	 * Diese Methode wird benutzt um die Benutzereingabe zu lesen und diese für den Array umzuwandeln
	 * @param board ist da weil der Computer muss wissen welche felder beetzt sind und muss ein zeichen auf das gewünschte feld setzten können
	 */
	public void playTurn(String[][] board) {
		int feld;
		int x = 0; 
		int y = 0;
		
		do {
			feld = ConsoleReader.readInteger("Geben Sie ein verfügbares Feld ein um darauf Ihr Zeichen zu setzten");
			switch (feld) {
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
		} while (feld < 1 || feld > 9 || board[x][y].matches(" X ") || board[x][y].matches(" O "));
		board[x][y] = " X ";
	}
}

package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

	/**
	 * @author Noé Lüthold
	 * @version 1.4
	 * Klasse mit der Main Methode
	 */

public class TicTacToe {
	
	public static void main(String[] args) {
		Programmstart start = new Programmstart();
		Board feld = new Board();
		GameOver over = new GameOver();
		Player p1 = new Player();
		EasyKI kiE = new EasyKI();
		DifficultKI kiD = new DifficultKI();
		
		// Informationen zum Programm
		start.info();
		
		// Aufrufbare Bedienungsanleitung
		String anleitung = ConsoleReader.readString("Wollen Sie zuerst die Spielanleitung lesen?");
		if (anleitung.equalsIgnoreCase("j") || anleitung.equalsIgnoreCase("ja") || anleitung.equalsIgnoreCase("y") || anleitung.equalsIgnoreCase("yes")) {
			// falls ja Bedienungsanleitung ausgeben
			start.anleitung();
		} else {
			// falls nein gehe auf eine neue zeile
			System.out.println("\n");
		}
		
		// muss hier deklariert werden da er erst in der schlaufe mit der bedingung einen richtigen wert bekommt
		String restart = "y";
		
		// Falls man das Spiel neu Starten will wiederholt sich alles von hier an
		do {
			// Abfrage für den Schwierigkeitsgrad der "KI"
			String bot = ConsoleReader.readString("Wählen Sie ein Schwierigkeitsgrad easy | difficult: ");
			System.out.println("\n");
			
			// board erstellen
			feld.initializeBoard();
			// board mit nummern wird ausgegeben
			feld.firstPrint();
			// der Spieler X kommt schon ausserhalb der game schlaufe einmal dran bei der übergabe des feldes und somit ist beim ersten durchlauf der schlaufe die ki dran
			String player = "X";
			// speichert das Spielfeld welches eine 2D Array ist in der 2D Array spielFeld[][]
			String spielFeld[][] = feld.setBoard();
			
			// wird wiederholt bis gameOver ist
			do {
				
				// das Board wird hier ausgegeben nach jedem spieldurchlauf 
				System.out.println(feld.printBoard());
				
				// falls X dran ist spieler nach einer eingabe fragen ansonsten ki spielen lassen
				if (player == "X") {
					System.out.println("X ist am Zug");
					p1.playTurn(spielFeld);
				} else {
					if (bot.equalsIgnoreCase("e") || bot.equalsIgnoreCase("easy") || bot.equalsIgnoreCase("einfach") || bot.equalsIgnoreCase("ez")) {
						kiE.kiEasyTurn(spielFeld);
					} else {
						kiD.kiDifficultTurn(spielFeld);
					}
				}
				
				// eine unelegante methode um pro bildschirm ein spielfeld zu sehen
				for(int i = 0; i < 100; i++) { System.out.println(); }
				start.info();
				
				// falls ein spieler 3 seiner zeichen in einer horizontalen, vertikalen oder diagonalen hat hat dieser gewonnen
				if (over.winner(player, spielFeld)) {
					System.out.println(feld.printBoard() + "\n" + player + " gewinnt\n");
					break;
				}
				// falls alle felder voll sind ist unentschieden
				else if (over.draw(spielFeld)) {
					System.out.println(feld.printBoard() + "\nUnentschieden\n");
					break;
				}
				
				// falls der Spieler X ist wird dieser zu O geändert sonst andersrum
				if (player == "X") {
					player = "O";
				} else {
					player = "X";
				}
				
				System.out.println();
			} while (true);
			
			// abfrage ob man nochmals spielen will
			restart = ConsoleReader.readString("Wollen Sie nochmal spielen?");
		} while (restart.equalsIgnoreCase("j") || restart.equalsIgnoreCase("ja") || restart.equalsIgnoreCase("y") || restart.equalsIgnoreCase("yes"));
	}
}

package m226b.ifz724004a.tictactoe;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Die Klasse Programmstart bietet Informationen zum Spiel an
 	 */

public class Programmstart {
	/**
	 * info:
	 * Gibt verschiedene informationen über das Programm aus
	 */
	public void info() {
		System.out.println("TOPOMEDICS");
		System.out.println("Author: Noé Lüthold");
		System.out.println("Version: 1.4");
		System.out.println("Latest Updated: 21.11.2018");
		System.out.println("\n\n\n");
	}
	
	/**
	 * anleitung:
	 * Dies ist die aufrufbare bedienungsanleitung
	 */
	public void anleitung() {
		System.out.println("Es empfielt sich das Numpad zum Spielen zu benutzen.");
		System.out.println("\nSPIELANLEITUNG:");
		System.out.println("Auf einem 3x3 grossem Spielfeld müssen 2 Spieler (in diesem Fall Sie gegen den Computer) abwechselnd ihre Zeichen (entweder Kreuz oder Kreis) in ein leeres Feld setzen");
		System.out.println("dabei gewinnt der Spieler der zuerst 3 seiner Zeichen neben einander Platziert hat.");
		System.out.println("Dabei kommt es nicht darauf an ob diese Horizontal, Vertikal oder Diagonal nebeneinanderstehen.\n\n");
	}
}

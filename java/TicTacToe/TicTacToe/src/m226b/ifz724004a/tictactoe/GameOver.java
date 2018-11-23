package m226b.ifz724004a.tictactoe;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Die klasse GameOver überprüft ob das Spiel zuende ist
 	 */

public class GameOver {
	
	/**
	 * Diese Methode ist dazu zuständig festzustellen ob 3 glecihe zeichen in einer vertikalen, horizontalen oder diagonalen linie existieren und den gewinner zu bestimmen 
	 * @param player muss die Methode bekommen weil sie muss ja wissen nach welchen zeichen sie suchen muss, ausserdem kann ja nur der derzeitige spieler gewinnen.
	 * @param board die Methode muss das board ja nach 3 gleichen zeichen in einer linie untersuchen
	 * @return falls 3 gleiche zeichen in einer linie vorhanden sind gibt es den wert 1 bzw. true zurück
	 */
public boolean winner(String player, String[][] board) {
		
		if (board[0][0].matches(" " + player + " ") && board[0][1].matches(" " + player + " ") && board[0][2].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[1][0].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[1][2].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[2][0].matches(" " + player + " ") && board[2][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[0][0].matches(" " + player + " ") && board[1][0].matches(" " + player + " ") && board[2][0].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[0][1].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][1].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[2][0].matches(" " + player + " ") && board[2][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[0][0].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		else if (board[0][2].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][0].matches(" " + player + " ")) {
			return true;
		}
		
		//no winner
		else {
			return false;
		}
	}
	
	/**
	 * Falls alle felder voll sind ist unentschieden, dies währe auch anders lösbar gewese bzw. einfacher, ich habe mich dennoch für dies entschieden
	 * @param board weil die methode das board untersuchen muss
	 * @return auch hier gibt es einen true wert zurück falls alle felder voll sind
	 */
	public boolean draw(String[][] board) {
		if (!board[0][0].equals("   ") && !board[0][1].equals("   ") && !board[0][2].equals("   ") && !board[1][0].equals("   ") && !board[1][1].equals("   ") && !board[1][2].equals("   ") && !board[2][0].equals("   ") && !board[2][1].equals("   ") && !board[2][2].equals("   ")) {
			return true;
		} 
		
		//no draw
		else {
			return false;
		}
	}
}

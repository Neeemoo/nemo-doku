package m226b.ifz724004a.tictactoe;

	/**
 	 * @author Noé Lüthold
 	 * @version 1.4
 	 * Erbt von KI da die einfache KI ja auch eine KI ist
 	 * Ist für die einfach KI zuständig
 	 */

public class EasyKI extends KI {
	/**
	 * kiEasyTurn:
	 * die einfache KI kann nur ein random feld auswählen und benutzt deshalb die methode von der klasse KI
	 */
	public void kiEasyTurn(String[][] fields) {
		super.kiBasicTurn(fields);
	}
}

package m226b.ifz724004a.tictactoe;

	/**
 	 * @author No� L�thold
 	 * @version 1.4
 	 * Erbt von KI da die einfache KI ja auch eine KI ist
 	 * Ist f�r die einfach KI zust�ndig
 	 */

public class EasyKI extends KI {
	/**
	 * kiEasyTurn:
	 * die einfache KI kann nur ein random feld ausw�hlen und benutzt deshalb die methode von der klasse KI
	 */
	public void kiEasyTurn(String[][] fields) {
		super.kiBasicTurn(fields);
	}
}

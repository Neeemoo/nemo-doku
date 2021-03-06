package luethold.noe.chess;

public class Board {
	private String[][] board;
	private static final int row = 8;
	private static final int col = 9;

	/**
	 * Board ist ein Konstruktor welcher dem board die gr�sse angibt
	 */
	public Board() {
		board = new String[row][col];
	}
	
	/**
	 * initializeBoard ist daf�r zust�ndig das wenn kein wert in einem feld ist das es 3 leerschl�ge drin hat damit das board trozdem die gew�nschte form hat
	 */
	public void initializeBoard() {
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				board[x][y] = "   ";
			}
		}
	}
	
	/**
	 * printBoard zeichnet die grenzen der verschiedenen Felder vom board damit es aussieht wie ein TicTacToe board
	 * @return Es gibt das entg�ltige board zur�ck
	 */
	public String printBoard() {
		String strBoard = "";
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				strBoard = strBoard + board[x][y] + "|";
			}
			strBoard = strBoard + "\n   |---|---|---|---|---|---|---|---|\n";
		}
		strBoard = "\n   |---|---|---|---|---|---|---|---|\n" + strBoard;
		return strBoard;
	}
	
	/**
	 * firstPrint druckt ein TicTacToe board aus welches nichts mit dem eigentlichen board zusammenh�ngt.
	 * Es sieht nur so aus und ist dazu da um die Tasten zum spielen zu zeigen
	 */
	public void firstPrint() {
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("---|---|---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---|---|---");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("\n");
	}
	
	/**
	 * setBoard:
	 * @return diese Methode gibt der Main methode das board als Array
	 */
	public String[][] setBoard() {
		return board;
	}
}

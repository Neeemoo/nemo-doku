package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class TicTacToe {

	public static void main(String[] args) {
		int rowNr = 0; 
		int colNr = 0;
		
		Board board = new Board();
		board.initializeBoard();
		String player = "X";
		
		do {
			System.out.println(board.printBoard());
			
			int feld;
			do {
				feld = ConsoleReader.readInteger("Geben Sie ein verfügbares Feld ein um darauf Ihr Zeichen zu setzten");
				if (feld == 9) {
					rowNr = 0;
					colNr = 2;
				} 
				else if (feld == 8) {
					rowNr = 0;
					colNr = 1;
				}
				else if (feld == 7) {
					rowNr = 0;
					colNr = 0;
				}
				else if (feld == 6) {
					rowNr = 1;
					colNr = 2;
				}
				else if (feld == 5) {
					rowNr = 1;
					colNr = 1;
				}
				else if (feld == 4) {
					rowNr = 1;
					colNr = 0;
				}
				else if (feld == 3) {
					rowNr = 2;
					colNr = 2;
				}
				else if (feld == 2) {
					rowNr = 2;
					colNr = 1;
				}
				else if (feld == 1) {
					rowNr = 2;
					colNr = 0;
				}
			} while (feld < 1 || feld > 9);
			
			board.setPlay(rowNr, colNr, player);
			
			if (board.gameOver()) {
				System.out.println(board.printBoard() + "\n" + player + " wins");
				break;
			}
			
			if (player == "X") {
				player = "O";
			} else {
				player = "X";
			}
		} while (true);
	}
}

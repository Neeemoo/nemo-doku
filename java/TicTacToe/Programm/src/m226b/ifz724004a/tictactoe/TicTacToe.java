package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class TicTacToe {

	public static void main(String[] args) {
		String restart = "y";
		Programmstart start = new Programmstart();
		
		start.info();
		
		String anleitung = ConsoleReader.readString("Wollen Sie zuerst die Spielanleitung lesen?");
		if (anleitung.equalsIgnoreCase("y") || anleitung.equalsIgnoreCase("yes") || anleitung.equalsIgnoreCase("j") || anleitung.equalsIgnoreCase("ja")) {
			start.anleitung();
		} else {
			System.out.println("\n");
		}
		
		do {
		
			KI ki = new KI();
			Board board = new Board();
			board.initializeBoard();
			String player = "X";
			String[][] fields = board.setPlay(player);
			
			
			do {
				System.out.println(board.printBoard());
				
				
				if (player == "X") {
					board.setPlay(player);
				} else {
					ki.kiTurn(fields, player);
				}
						
				if (board.gameOver(player)) {
					System.out.println(board.printBoard() + "\n" + player + " gewinnt");
					break;
				}
				
				if (player == "X") {
					player = "O";
				} else {
					player = "X";
				}
			} while (true);
			restart = ConsoleReader.readString("Wollen Sie nochmal spielen?");
		} while (restart.equalsIgnoreCase("y") || restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("j") || restart.equalsIgnoreCase("ja"));
	}
}

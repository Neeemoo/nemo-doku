package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class TicTacToe {

	public static void main(String[] args) {
		String restart = "y";
//		String anleitung;
		Programmstart start = new Programmstart();
		
		start.info();
		
//		anleitung = ConsoleReader.readString("Geben Sie \"help\" ein um die Spielanleitung zu sehen");
//		if (anleitung == "help") {
//			start.anleitung();
//		}
		
		do {
		
			Board board = new Board();
			board.initializeBoard();
			String player = "X";
			
			do {
				System.out.println(board.printBoard());
				
				board.setPlay(player);
				
				if (board.gameOver()) {
					System.out.println(board.printBoard() + "\n" + player + " gewinnt");
					break;
				}
				
				if (player == "X") {
					player = "O";
				} else {
					player = "X";
				}
			} while (true);
			restart = ConsoleReader.readString("Wollen Sie nochmal spielen");
		} while (restart.equalsIgnoreCase("y") || restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("j") || restart.equalsIgnoreCase("ja"));
	}
}

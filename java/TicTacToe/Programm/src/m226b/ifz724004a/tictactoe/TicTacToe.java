package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class TicTacToe {

	public static void main(String[] args) {
		String restart = "y";
		Programmstart start = new Programmstart();
		
		
		start.info();
		
		String anleitung = ConsoleReader.readString("Wollen Sie zuerst die Spielanleitung lesen?");
		if (anleitung.equalsIgnoreCase("j") || anleitung.equalsIgnoreCase("ja") || anleitung.equalsIgnoreCase("y") || anleitung.equalsIgnoreCase("yes")) {
			start.anleitung();
		} else {
			System.out.println("\n");
		}
		
		do {
			String bot = ConsoleReader.readString("Wählen Sie ein Schwierigkeitsgrad easy | difficult: ");
			System.out.println("\n");
			Board board = new Board();
			board.initializeBoard();
			board.firstPrint();
			String player = "X";
			EasyKI kiE = new EasyKI();
			DifficultKI kiM = new DifficultKI();
			String spielFeld[][] = board.playTurn(player);
			if (bot.equalsIgnoreCase("e") || bot.equalsIgnoreCase("easy") || bot.equalsIgnoreCase("einfach") || bot.equalsIgnoreCase("ez")) {
				kiE.kiTurn(spielFeld, player);
			} else {
				kiM.kiTurn(spielFeld, player);
			}
			
			do {
				System.out.println(board.printBoard());
				
				if (player == "X") {
					System.out.println("X ist am Zug");
					board.playTurn(player);
				} else {
					if (bot.equalsIgnoreCase("e") || bot.equalsIgnoreCase("easy") || bot.equalsIgnoreCase("einfach") || bot.equalsIgnoreCase("ez")) {
						System.out.println("Easy KI");
						kiE.kiTurn(spielFeld, player);
					} else {
						System.out.println("Difficult KI");
						kiM.kiTurn(spielFeld, player);
					}
				}
						
				if (board.winner(player)) {
					System.out.println(board.printBoard() + "\n" + player + " gewinnt\n");
					break;
				}
				else if (board.draw()) {
					System.out.println(board.printBoard() + "\nUnentschieden\n");
					break;
				}
				
				if (player == "X") {
					player = "O";
				} else {
					player = "X";
				}
			} while (true);
			
			restart = ConsoleReader.readString("Wollen Sie nochmal spielen?");
		} while (restart.equalsIgnoreCase("j") || restart.equalsIgnoreCase("ja") || restart.equalsIgnoreCase("y") || restart.equalsIgnoreCase("yes"));
	}
}

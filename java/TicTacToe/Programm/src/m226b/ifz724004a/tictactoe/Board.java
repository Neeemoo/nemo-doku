package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class Board {		
	private String[][] board;
	private static final int row = 3;
	private static final int col = 3;

	
	public Board() {
		board = new String[row][col];
	}
	
	public void initializeBoard() {
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				board[x][y] = "   ";
			}
		}
	}
	
	public String printBoard() {
		String strBoard = "";
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				if (y == col - 1) {
					strBoard = strBoard + board[x][y];
				} else {
					strBoard = strBoard + board[x][y] + "|";
				}
			}
			
			if (x != row - 1) {
			strBoard = strBoard + "\n---|---|---\n";
			}
		}
		System.out.println("\n");
		return strBoard;
	}
	
	public void firstPrint() {
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("---|---|---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---|---|---");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("\n");
	}
	
	public String[][] playTurn(String player) {
		int feld;
		int x = 0; 
		int y = 0;
		
		do {
			feld = ConsoleReader.readInteger("Geben Sie ein verfügbares Feld ein um darauf Ihr Zeichen zu setzten");
			if (feld == 9) {
				x = 0;
				y = 2;
			} 
			else if (feld == 8) {
				x = 0;
				y = 1;
			}
			else if (feld == 7) {
				x = 0;
				y = 0;
			}
			else if (feld == 6) {
				x = 1;
				y = 2;
			}
			else if (feld == 5) {
				x = 1;
				y = 1;
			}
			else if (feld == 4) {
				x = 1;
				y = 0;
			}
			else if (feld == 3) {
				x = 2;
				y = 2;
			}
			else if (feld == 2) {
				x = 2;
				y = 1;
			}
			else if (feld == 1) {
				x = 2;
				y = 0;
			}
		} while (feld < 1 || feld > 9 || board[x][y].matches(" X ") || board[x][y].matches(" O "));
		if (player == "X") {
			board[x][y] = " X ";
		}
		return board;
	}
	
	public boolean winner(String player) {
		
		if (board[0][0].matches(" " + player + " ") && board[0][1].matches(" " + player + " ") && board[0][2].matches(" " + player + " ")) {
			return true;
		}
		
		if (board[1][0].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[1][2].matches(" " + player + " ")) {
			return true;
		}
		
		if (board[2][0].matches(" " + player + " ") && board[2][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		

		if (board[0][0].matches(" " + player + " ") && board[1][0].matches(" " + player + " ") && board[2][0].matches(" " + player + " ")) {
			return true;
		}
		
		if (board[0][1].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][1].matches(" " + player + " ")) {
			return true;
		}
		
		if (board[2][0].matches(" " + player + " ") && board[2][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		
		if (board[0][0].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][2].matches(" " + player + " ")) {
			return true;
		}
		
		if (board[0][2].matches(" " + player + " ") && board[1][1].matches(" " + player + " ") && board[2][0].matches(" " + player + " ")) {
			return true;
		}
		
	   	//no winner
	   	return false;
	}
	
	public boolean draw() {
		if (!board[0][0].equals("   ") && !board[0][1].equals("   ") && !board[0][2].equals("   ") && !board[1][0].equals("   ") && !board[1][1].equals("   ") && !board[1][2].equals("   ") && !board[2][0].equals("   ") && !board[2][1].equals("   ") && !board[2][2].equals("   ")) {
			return true;
		}
		//no draw
		return false;
	}
}
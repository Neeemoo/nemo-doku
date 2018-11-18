package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class Board {		
	private String[][] board;
	private static final int row = 3;
	private static final int col = 3;
	private String coordinates = "\\s{3}";
	
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
	
	public void setPlay(String player) {
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
			if (board[x][y].matches(coordinates)) {
					if (player == "X") {
						board[x][y] = " X ";
					} else {
						board[x][y] = " O ";
					}	
			}
	}
	
	public boolean gameOver() {
		
		//rows
		for(int x = 0; x < row; x++) {
    		if(!board[x][0].matches(coordinates) && board[x][0].equals(board[x][1]) && board[x][1].equals(board[x][2])) {    			
    			return true; 
    		}   			 			
    	}
    	
		//columns
    	for(int y = 0; y < col; y++) {    		
    		if(!board[0][y].matches(coordinates) && board[0][y].equals(board[1][y]) && board[1][y].equals(board[2][y])) {
    			return true;  		
    		}
    	}
    	
	   	//diagonals
	   	if(!board[0][0].matches(coordinates) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
	   			return true;
		}
	   	
	   	if(!board[0][2].matches(coordinates) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
	   		return true;
		}
	   	
	   	//no winner
	   	return false;
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
			strBoard = strBoard + "\n---+---+---\n";
			}
		}
		return strBoard;
	}
}
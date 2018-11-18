package m226b.ifz724004a.tictactoe;

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
	
	public void setPlay(int x, int y, String player) {
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
    		if(!board[0][y].matches(coordinates) && board[0][y].equals(board[1][y]) && board[1][y].equals(board[2][y])) 
   			return true;  			
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
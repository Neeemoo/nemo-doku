package m226b.ifz724004a.tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameOverTest {

	@Test
	void testBoard() {
		String[][] board;
		final int row = 3;
		final int col = 3;
		String player = "X";
		
		board = new String[row][col];
		
		
			for (int x = 0; x < row; x++) {
				for (int y = 0; y < col; y++) {
					board[x][y] = "   ";
				}
			}

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
	
	board[1][1] = " " + player + " ";
	
	assertFalse(board[1][1] == " X ");
	}
	
	@Test
	void TestBoardTwo() {
			String[][] board;
			final int row = 3;
			final int col = 3;
			String player = "X";
			
			board = new String[row][col];
			
			
				for (int x = 0; x < row; x++) {
					for (int y = 0; y < col; y++) {
						board[x][y] = "   ";
					}
				}

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
		
		board[1][1] = " " + player + " ";
		
		assertTrue(board[1][1].matches(" X "));
	}
}

package luethold.noe.chess;

public class Chess {

	public static void main(String[] args) {
		Board board = new Board();
		board.initializeBoard();
		System.out.println(board.printBoard());
	}

}

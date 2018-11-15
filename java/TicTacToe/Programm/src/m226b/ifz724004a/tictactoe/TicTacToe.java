package m226b.ifz724004a.tictactoe;

public class TicTacToe {

	public static void main(String[] args) {
		SpielFeld feld = new SpielFeld();
		Player p1 = new Player();
		Computer ki = new Computer();
		
		feld.spielFeld();
		p1.player();
		feld.spielFeld();
		ki.computer();
	}

}

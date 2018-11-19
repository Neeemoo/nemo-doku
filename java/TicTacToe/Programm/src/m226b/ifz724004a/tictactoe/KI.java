package m226b.ifz724004a.tictactoe;

public class KI {
	public void kiTurn(String[][] fields, String player) {
		int kiZug;
		int x = 0; 
		int y = 0;
		
		do {
			kiZug = (int) (Math.random() * ((9 - 1) + 1)) + 1;
			if (kiZug == 9) {
				x = 0;
				y = 2;
			} 
			else if (kiZug == 8) {
				x = 0;
				y = 1;
			}
			else if (kiZug == 7) {
				x = 0;
				y = 0;
			}
			else if (kiZug == 6) {
				x = 1;
				y = 2;
			}
			else if (kiZug == 5) {
				x = 1;
				y = 1;
			}
			else if (kiZug == 4) {
				x = 1;
				y = 0;
			}
			else if (kiZug == 3) {
				x = 2;
				y = 2;
			}
			else if (kiZug == 2) {
				x = 2;
				y = 1;
			}
			else if (kiZug == 1) {
				x = 2;
				y = 0;
			}
		} while (fields[x][y].matches(" X ") || fields[x][y].matches(" O "));
		
			if (player == "X") {
				fields[x][y] = " X ";
			} else {
				fields[x][y] = " O ";
			}
	}
}
package m226b.ifz724004a.tictactoe;

public class DifficultKI extends KI{
	public void kiMediumTurn(String[][] fields, String player) {
		if (fields[0][1].matches(" X ") && fields[0][2].matches(" X ")) {
			fields[0][0] = " O ";
		}
		else if (fields[0][0].matches(" X ") && fields[0][2].matches(" X ")) {
			fields[0][1] = " O ";
		}
		else if (fields[0][0].matches(" X ") && fields[0][1].matches(" X ")) {
			fields[0][2] = " O ";
		}
		
		else if (fields[1][1].matches(" X ") && fields[1][2].matches(" X ")) {
			fields[1][0] = " O ";
		}
		else if (fields[1][0].matches(" X ") && fields[1][2].matches(" X ")) {
			fields[1][1] = " O ";
		}
		else if (fields[1][0].matches(" X ") && fields[1][1].matches(" X ")) {
			fields[1][2] = " O ";
		}
		
		else if (fields[2][1].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[2][0] = " O ";
		}
		else if (fields[2][0].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[2][1] = " O ";
		}
		else if (fields[2][0].matches(" X ") && fields[2][1].matches(" X ")) {
			fields[2][2] = " O ";
		}
		
		
		else if (fields[1][0].matches(" X ") && fields[2][0].matches(" X ")) {
			fields[0][0] = " O ";
		}
		else if (fields[0][0].matches(" X ") && fields[2][0].matches(" X ")) {
			fields[1][0] = " O ";
		}
		else if (fields[0][0].matches(" X ") && fields[1][0].matches(" X ")) {
			fields[2][0] = " O ";
		}
		
		else if (fields[1][1].matches(" X ") && fields[2][1].matches(" X ")) {
			fields[0][1] = " O ";
		}
		else if (fields[0][1].matches(" X ") && fields[2][1].matches(" X ")) {
			fields[1][1] = " O ";
		}
		else if (fields[0][1].matches(" X ") && fields[1][1].matches(" X ")) {
			fields[2][1] = " O ";
		}
		
		else if (fields[1][2].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[0][2] = " O ";
		}
		else if (fields[0][2].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[1][2] = " O ";
		}
		else if (fields[0][2].matches(" X ") && fields[1][2].matches(" X ")) {
			fields[2][2] = " O ";
		}
		
		
		else if (fields[0][0].matches(" X ") && fields[1][1].matches(" X ")) {
			fields[2][2] = " O ";
		}
		
		else if (fields[0][0].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[1][1] = " O ";
		}
		
		else if (fields[1][1].matches(" X ") && fields[2][2].matches(" X ")) {
			fields[0][0] = " O ";
		}
		
		
		else if (fields[2][0].matches(" X ") && fields[1][1].matches(" X ")) {
			fields[0][2] = " O ";
		}
		
		else if (fields[2][0].matches(" X ") && fields[0][2].matches(" X ")) {
			fields[1][1] = " O ";
		}
		
		else if (fields[1][1].matches(" X ") && fields[0][2].matches(" X ")) {
			fields[2][0] = " O ";
		}
		
		
		
		
		
		else if (fields[0][1].matches(" O ") && fields[0][2].matches(" O ")) {
			fields[0][0] = " O ";
		}
		else if (fields[0][0].matches(" O ") && fields[0][2].matches(" O ")) {
			fields[0][1] = " O ";
		}
		else if (fields[0][0].matches(" O ") && fields[0][1].matches(" O ")) {
			fields[0][2] = " O ";
		}
		
		else if (fields[1][1].matches(" O ") && fields[1][2].matches(" O ")) {
			fields[1][0] = " O ";
		}
		else if (fields[1][0].matches(" O ") && fields[1][2].matches(" O ")) {
			fields[1][1] = " O ";
		}
		else if (fields[1][0].matches(" O ") && fields[1][1].matches(" O ")) {
			fields[1][2] = " O ";
		}
		
		else if (fields[2][1].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[2][0] = " O ";
		}
		else if (fields[2][0].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[2][1] = " O ";
		}
		else if (fields[2][0].matches(" O ") && fields[2][1].matches(" O ")) {
			fields[2][2] = " O ";
		}
		
		
		else if (fields[1][0].matches(" O ") && fields[2][0].matches(" O ")) {
			fields[0][0] = " O ";
		}
		else if (fields[0][0].matches(" O ") && fields[2][0].matches(" O ")) {
			fields[1][0] = " O ";
		}
		else if (fields[0][0].matches(" O ") && fields[1][0].matches(" O ")) {
			fields[2][0] = " O ";
		}
		
		else if (fields[1][1].matches(" O ") && fields[2][1].matches(" O ")) {
			fields[0][1] = " O ";
		}
		else if (fields[0][1].matches(" O ") && fields[2][1].matches(" O ")) {
			fields[1][1] = " O ";
		}
		else if (fields[0][1].matches(" O ") && fields[1][1].matches(" O ")) {
			fields[2][1] = " O ";
		}
		
		else if (fields[1][2].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[0][2] = " O ";
		}
		else if (fields[0][2].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[1][2] = " O ";
		}
		else if (fields[0][2].matches(" O ") && fields[1][2].matches(" O ")) {
			fields[2][2] = " O ";
		}
		
		
		else if (fields[0][0].matches(" O ") && fields[1][1].matches(" O ")) {
			fields[2][2] = " O ";
		}
		
		else if (fields[0][0].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[1][1] = " O ";
		}
		
		else if (fields[1][1].matches(" O ") && fields[2][2].matches(" O ")) {
			fields[0][0] = " O ";
		}
		
		
		else if (fields[2][0].matches(" O ") && fields[1][1].matches(" O ")) {
			fields[0][2] = " O ";
		}
		
		else if (fields[2][0].matches(" O ") && fields[0][2].matches(" O ")) {
			fields[1][1] = " O ";
		}
		
		else if (fields[1][1].matches(" O ") && fields[0][2].matches(" O ")) {
			fields[2][0] = " O ";
		}
		
		else {
			super.kiTurn(fields, player);
		}
	}
}

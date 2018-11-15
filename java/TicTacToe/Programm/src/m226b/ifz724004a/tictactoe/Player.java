package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class Player extends Item {
	
	public void player() {
		int zug;
		do {
			zug = ConsoleReader.readInteger("Bitte geben Sie eine Zahl ein");
			if (zug < 10 && zug > 0) {
				switch(zug) {
		        	case 1 :
		        		f1 = 'X';
		        		System.out.println(f1);
		        		break;
		        	case '2' :
			            break;
		        	case '3' :
			            break;
		        	case '4' :
			            break;
		        	case '5' :
			            break;
		        	case '6' :
			            break;
		        	case '7' :
			            break;
		        	case '8' :
			            break;
		        	case '9' :
			            break;
		      }
			}
		}while (zug < 1 || zug > 9);
	}
}
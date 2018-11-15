package m226b.ifz724004a.tictactoe;

import m226b.ifz724004a.utils.ConsoleReader;

public class Player {
	
		char f1 = '1';
		char f2 = '2';
		char f3 = '3';
		char f4 = '4';
		char f5 = '5';
		char f6 = '6';
		char f7 = '7';
		char f8 = '8';
		char f9 = '9';
	
	public void player() {
		int zug;
		do {
			zug = ConsoleReader.readInteger("Bitte geben Sie eine Zahl ein");
			if (zug < 10 && zug > 0) {
				switch(zug) {
		        	case '1' :
		        		f1 = 'X';
		        		break;
		        	case '2' :
		        		f2 = 'X';
			            break;
		        	case '3' :
		        		f3 = 'X';
			            break;
		        	case '4' :
		        		f4 = 'X';
			            break;
		        	case '5' :
		        		f5 = 'X';
			            break;
		        	case '6' :
		        		f6 = 'X';
			            break;
		        	case '7' :
		        		f7 = 'X';
			            break;
		        	case '8' :
		        		f8 = 'X';
			            break;
		        	case '9' :
		        		f9 = 'X';
			            break;
		      }
			}
		}while (zug < 1 || zug > 9);
	}
}

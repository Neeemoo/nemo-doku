package m226b.ifz724004a.tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void test() {
		//setting value
		final int row = 3;

		//testing if possible with final
		double result = row - 1;
		assertTrue(result == 2);
	}

}

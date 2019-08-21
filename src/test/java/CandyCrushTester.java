import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CandyCrushTester {

	private CandyCrush instance;

	@Before
	public void setup() {
		instance = new CandyCrush();
	}


	@Test
	public void is3opEenRij() {
		char[][] gameboard =  {{ 'A', 'A', 'A' },{},{},{} };
		assertTrue(instance.hasMovableFields(gameboard));
	}

	@Test
	public void is3opEenRijOp2DeRegel() {
		char[][] gameboard =  {{ 'A', 'B', 'A' },{'A', 'A', 'A'},{},{} };
		assertTrue(instance.hasMovableFields(gameboard));
	}

	@Test
	public void is3opEenRijOp3DeRegel() {
		char[][] gameboard =  {{ 'A', 'B', 'A' },{ 'A', 'B', 'A' },{'A', 'A', 'A'} };
		assertTrue(instance.hasMovableFields(gameboard));
	}
//	@Test
//	public void is3opEenRijOpEersteKolom() {
//		char[][] gameboard =  {{ 'A'},{ 'A'},{'A'} };
//		assertTrue(instance.hasMovableFields(gameboard));
//	}

	@Test
	public void isGeen3opEenRij() {
		char[][] gameboard =  {{ 'B', 'A', 'A' }, { 'B', 'B', 'A'}} ;
		assertFalse(instance.hasMovableFields(gameboard));
	}

	@Test
	public void is3opEenRijVan4() {
		char[][] gameboard =  {{ 'B', 'A', 'A', 'A' }, {},{},{} };
		assertTrue(instance.hasMovableFields(gameboard));
	}

	@Test
	public void is2opEenRijVan4() {
		char[][] gameboard =  {{ 'B', 'B', 'A', 'A' }, { 'B', 'B', 'A', 'A'  }} ;
		assertFalse(instance.hasMovableFields(gameboard));
	}

	@Test
	public void geen3OpEenRijVolledigBord() {
		char[][] gameboard = {{'A'}, {'A'}, {'A'}, {'B'}};
		assertFalse(instance.hasMovableFields(gameboard));
	}
//
//	@Test
//	public void testGameBoard_canMove2_2() {
//		char[][] gameboard = { { 'R', 'Y', 'G', 'Y' }, { 'Y', 'P', 'G', 'R' }, { 'P', 'O', 'O', 'Y' },
//				{ 'B', 'O', 'B', 'O' } };
//		assertTrue(instance.hasMovableFields(gameboard));
//	}
//	@Test
//	public void testSimpleStaticBoard() {
//		char[][] gameboard = { { 'R', 'Y', 'G', 'Y' }, { 'Y', 'P', 'G', 'R' }, { 'P', 'O', 'O', 'Y' },
//				{ 'B', 'O', 'O', 'B' } };
//		assertFalse(instance.hasMovableFields(gameboard));
//	}
//	@Test
//	public void testGameBoard_canMove1_2() {
//		char[][] gameboard = { { 'R', 'Y', 'G', 'Y' }, { 'Y', 'P', 'O', 'R' }, { 'P', 'O', 'G', 'Y' },
//				{ 'B', 'O', 'O', 'B' } };
//		assertTrue(instance.hasMovableFields(gameboard));
//	}
//	@Test
//	public void testSmallStaticRowBoardFalse() {
//		char[][] gameboard = { { 'A', 'B', 'C', 'D' } };
//		assertFalse(instance.hasMovableFields(gameboard));
//	}
//
//	@Test
//	public void testSmallStaticRowBoardTrue() {
//		char[][] gameboard = { { 'A', 'A', 'B', 'A' } };
//		assertTrue(instance.hasMovableFields(gameboard));
//	}
//
//	@Test
//	public void testGameBoard_canMove3() {
//		char[][] gameboard = { { 'R', 'Y', 'G', 'Y' }, { 'Y', 'P', 'G', 'O' }, { 'G', 'R', 'O', 'Y' },
//				{ 'B', 'P', 'B', 'O' } };
//		assertTrue(instance.hasMovableFields(gameboard));
//	}

}
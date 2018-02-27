package zad2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class SortingTest {
	
	private Sorting test;

	@Test
	public void returnsTrueWhenArrayIsSorted() {
		int[] temp = { 1, 2, 3, 4 };
		test = new Sorting(temp);
		assertTrue(test.isSorted());
	}
	
	@Test
	public void returnsFalseWhenArrayIsNotSorted() {
		int[] temp = { 12, 2, 3, 4 };
		test = new Sorting(temp);
		assertFalse(test.isSorted());
	}
	
	@Test
	public void returnsCorrectStringToOutput() {
		int[] temp = { 1, 2, 3, 4 };
		String tmp = "[1, 2, 3, 4]";
		test = new Sorting(temp);
		assertEquals(test.showArray(), tmp);
	}
	
	@Test
	public void checkWithIncorrectString() {
		int[] temp = { 1, 2, 3, 4 };
		String tmp = "1, 2, 3, 4";
		test = new Sorting(temp);
		assertNotEquals(test.showArray(), tmp);
	}
	
	@Test
	public void sortArrayReturnsSortedArrayInc() {
		int[] temp = { 1, 2, 3, 4 };
		int[] tmp = { 2, 1, 4, 3 };
		test = new Sorting(tmp);
		test.sortArray('M');
		assertArrayEquals(test.table, temp);
	}
	
	@Test
	public void sortArrayReturnsSortedArrayInc2() {
		int[] temp = { 2, 1, 4, 3 };
		int[] tmp = { 2, 1, 4, 3 };
		test = new Sorting(tmp);
		test.sortArray('M');
		assertFalse(Arrays.equals(temp, test.table));
	}
	
	@Test
	public void sortArrayReturnsSortedArrayDec() {
		int[] temp = { 4, 3, 2, 1 };
		int[] tmp = { 2, 1, 4, 3 };
		test = new Sorting(tmp);
		test.sortArray('C');
		assertArrayEquals(test.table, temp);
	}
	
	@Test
	public void sortArrayReturnsSortedArrayDec2() {
		int[] temp = { 2, 1, 4, 3 };
		int[] tmp = { 2, 1, 4, 3 };
		test = new Sorting(tmp);
		test.sortArray('C');
		assertFalse(Arrays.equals(temp, test.table));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void returnExceptionWhenArrayIsNullIsSorted() {
		int[] temp = {};
		test = new Sorting(temp);
		assertTrue(test.isSorted());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void returnExceptionWhenWrongArgumentPassed() {
		int[] temp = { 2, 1, 4, 3 };
		int[] tmp = { 2, 1, 4, 3 };
		test = new Sorting(tmp);
		test.sortArray('D');
		assertFalse(Arrays.equals(temp, test.table));
	}
	
	@Test(expected = NullPointerException.class)
	public void returnExceptionWhenArrayIsEmpty() {
		int[] temp = { 2, 1, 4, 3 };
		int[] tmp = {};
		test = new Sorting(tmp);
		test.sortArray('D');
		assertFalse(Arrays.equals(temp, test.table));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void returnExceptionWhenArrayIsNull() {
		int[] temp = { 2, 1, 4, 3 };
		int[] tmp = null;
		test = new Sorting(tmp);
		test.sortArray('D');
		assertFalse(Arrays.equals(temp, test.table));
	}
	
	@After
	public void tearDown() {
		test = null;
	}

}

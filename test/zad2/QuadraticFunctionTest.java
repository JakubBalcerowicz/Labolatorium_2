package zad2;

import static org.junit.Assert.*;

import org.junit.Test;



public class QuadraticFunctionTest {
	double epsilon = 1E-10;

	@Test
	public void returnX1Diff(){
		assertEquals(4, QuadraticFunction.of(-1.0, 3.0, 4.0).getX1(), epsilon);
	}

	@Test
	public void returnX2Diff(){
		assertEquals(-1, QuadraticFunction.of(-1.0, 3.0, 4.0).getX2(), epsilon);
	}

	@Test
	public void returnX1(){
		assertEquals(-1.0, QuadraticFunction.of(1.0, 2.0, 1.0).getX1(), epsilon);
	}

	@Test
	public void returnX2(){
		assertEquals(-1.0, QuadraticFunction.of(1.0, 2.0, 1.0).getX2(), epsilon);
	}

	@Test
	public void returnresult1(){
		assertEquals(0, QuadraticFunction.of(2.0, 0.0, 0.0).getX1(), epsilon);
	}

	@Test
	public void returnresult2(){
		assertEquals(0, QuadraticFunction.of(0.0, 2.0, 0.0).getX2(), epsilon);
	}

	@Test
	public void returnresult3(){
		assertEquals(Double.NEGATIVE_INFINITY, QuadraticFunction.of(0.0, 0.0, 2.0).getX2(), epsilon);
	}

	@Test
	public void returnresult4(){
		assertEquals(-1, QuadraticFunction.of(0.0, 2.0, 2.0).getX2(), epsilon);
	}

	@Test(expected = IllegalArgumentException.class)
	public void returnNull(){
		assertEquals(null, QuadraticFunction.of(1.0, -4.0, 10.0));
	}
}

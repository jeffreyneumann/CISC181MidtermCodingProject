package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void RectangleTest() {
		try {
			Rectangle R = new Rectangle(2,2);
		} catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void getiWidthTest() {
		Rectangle R = new Rectangle(2,3);
		if (R.getiWidth() != 2) {
			fail("Test failed to get iWidth");
		}
	}
	
	@Test
	public void getiLengthTest() {
		Rectangle R = new Rectangle(2,3);
		if (R.getiLength() != 3) {
			fail("Test failed to get iLength");
		}
	}
	
	@Test
	public void setiWidthTest() {
		Rectangle R = new Rectangle(2,3);
		R.setiWidth(5);
		if (R.getiWidth() != 5) {
			fail("Test failed to set iWidth");
		}
	}
	
	@Test
	public void setiLengthTest() {
		Rectangle R = new Rectangle(2,3);
		R.setiLength(5);
		if (R.getiLength() != 5) {
			fail("Test failed to set iLength");
		}
	}
	
	@Test 
	public void areaTest() {
		Rectangle R = new Rectangle(2,3);
		if (R.area() != 6) {
			fail("Test failed to calculate area");
		}
	}
	
	@Test 
	public void perimeterTest() {
		Rectangle R = new Rectangle(2,3);
		if (R.perimeter() != 10) {
			fail("Test failed to calculate perimeter");
		}
	}
	
	@Test 
	public void compareToTest() {
		Rectangle R1 = new Rectangle(2,3);
		Rectangle R2 = new Rectangle(3,3);
		if (R1.compareTo(R2) != -1) {
			fail("Test failed to calculate perimeter");
		}
	}
	
	@Test
	public void RectangleTest1() {
		boolean fail = true;
		try {
			Rectangle R = new Rectangle(2,-2);
		} catch (Exception IllegalArgumentException) {
			fail = false;
		} finally{
			if (fail)
				fail("Test failed to build a Rectangle");
		}
	}
}

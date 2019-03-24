package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test(expected = Exception.class)
	public void RectangleConstructTest() {
		Rectangle rec = new Rectangle(3,-8);
	}
	
	@Test(expected = Exception.class)
	public void RectangleConstructTest2() {
		Rectangle rec = new Rectangle(-3,8);
	}
	
	@Test
	public void getiWidthTest() {
		Rectangle rec = new Rectangle(3,5);
		int expected = 3;
		assertTrue(expected == rec.getiWidth());
		
	}
	
	@Test
	public void getiLengthTest() {
		Rectangle rec = new Rectangle(3,5);
		int expected = 5;
		assertTrue(expected == rec.getiLength());
	}
	
	@Test
	public void setiWidthTest() {
		Rectangle rec = new Rectangle(1,1);
		rec.setiWidth(4);
		int expected = 4;
		assertTrue(expected == rec.getiWidth());
	}
	
	@Test
	public void setiLengthTest() {
		Rectangle rec = new Rectangle(1,1);
		rec.setiLength(4);
		int expected = 4;
		assertTrue(expected == rec.getiLength());
	}
	
	@Test
	public void areaTest() {
		Rectangle rec = new Rectangle(3,5);
		double expected = 15.0;
		assertTrue(expected == rec.area());
	}
	
	@Test
	public void perimeterTest() {
		Rectangle rec = new Rectangle(3,5);
		double expected = 16;
		assertTrue(expected == rec.perimeter());
	}
	
	@Test
	public void compareToTest() {
		Rectangle rec = new Rectangle(4,5);
		Rectangle rec1 = new Rectangle(3,8);
		Rectangle rec2 = new Rectangle(1,2);
		Rectangle rec3 = new Rectangle(13,49);
		assertTrue(rec.compareTo(rec1)<0);
		assertTrue(rec.compareTo(rec2)>0);
		assertTrue(rec.compareTo(rec3)<0);

	}
	
	
	
}

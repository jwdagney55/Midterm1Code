package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
//import pkgShape.Cuboid;

public class CuboidTest {

	@Test(expected = Exception.class)
	public void CuboidConstructTest() {
		Cuboid cube = new Cuboid(3,4,-5);
		
	}
	
	@Test
	public void getiDepthTest() {
		Cuboid cube = new Cuboid(3,4,5);
		int expected = 5;
		assertTrue(expected == cube.getiDepth());
	}
	
	@Test
	public void setiDepthTest() {
		Cuboid cube = new Cuboid(3,3,3);
		cube.setiDepth(5);
		int expected = 5;
		assertTrue(expected == cube.getiDepth());
	}
	
	@Test
	public void areaTest() {
		Cuboid cube = new Cuboid(3,4,5);
		int surfaceArea = 2* (3*4)+ 2* (3*5) + 2 * (4*5);
		assertTrue(surfaceArea == cube.area());
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid cube = new Cuboid(3,4,5);
		double perimeter = cube.perimeter();
	}
	
	@Test
	public void SortByAreaTest() {
		ArrayList<Cuboid> cubeArr = new ArrayList<Cuboid>();
		cubeArr.add(new Cuboid(3,4,5));
		cubeArr.add(new Cuboid(6,3,9));
		cubeArr.add(new Cuboid(11,6,7));
		cubeArr.add(new Cuboid(2,3,1));
		Collections.sort(cubeArr,new SortByArea());
		for (Cuboid i : cubeArr) {
			System.out.println("Area is " + i.area());
		}
	}
	
	@Test
	public void SortByVolumeTest() {
		ArrayList<Cuboid> cubeArr = new ArrayList<Cuboid>();
		cubeArr.add(new Cuboid(3,4,5));
		cubeArr.add(new Cuboid(6,3,9));
		cubeArr.add(new Cuboid(11,6,7));
		cubeArr.add(new Cuboid(2,3,1));
		Collections.sort(cubeArr,new SortByVolume());
		for (Cuboid i : cubeArr) {
			System.out.println("Volume is " + i.volume());
		}
	}
}

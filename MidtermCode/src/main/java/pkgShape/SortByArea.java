package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid>{

	SortByArea() {
	}
	
	public int compare(Cuboid o1, Cuboid o2) {
		// TODO Auto-generated method stub
		if (o1.area() > o2.area())
			return 1;
		else if (o1.area() < o2.area())
			return -1;
		else
			return 0;
	}

	
	
}

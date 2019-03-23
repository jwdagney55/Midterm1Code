package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> {
	
	SortByVolume() {
	}


	public int compare(Cuboid o1, Cuboid o2) {
		// TODO Auto-generated method stub
		
		if (o1.volume() > o2.volume())
			return 1;
		else if (o1.volume() < o2.volume())
			return -1;
		else
			return 0;
	}

	
}

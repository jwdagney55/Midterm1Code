package pkgShape;

public class Cuboid extends Rectangle {

	private int iDepth;

	
	public Cuboid(int dWidth, int dLength, int dDepth) {
		super(dWidth,dLength);
		
		if (dDepth > 0 )
			iDepth = dDepth;
		else
			throw new IllegalArgumentException();
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int newDepth) {
		iDepth = newDepth;
	}
	
	@Override
	public double area() {
		return 2 * (getiWidth()* getiLength()) + 
				2 * (getiWidth() * iDepth) +
				2 * (getiLength() * iDepth);
	}
	
	public double volume() {
		
		return getiWidth() * getiLength() * iDepth;
	}
	
	@Override 
	public double perimeter() {
		throw new UnsupportedOperationException();
		
	}
	
	@Override
	public int compareTo(Object obj) {
		
		
		return 0;
		
	}
}

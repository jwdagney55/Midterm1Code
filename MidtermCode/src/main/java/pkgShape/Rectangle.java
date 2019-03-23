package pkgShape;

public class Rectangle extends Shape {

	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int dWidth, int dLength) throws IllegalArgumentException{
		
		if (dWidth>0)
			iWidth = dWidth;
		else
			throw new IllegalArgumentException();
		
		if (dLength>0)
			iLength = dLength;
		else
			throw new IllegalArgumentException();
	}
	
	public void setiWidth(int newWidth)
	{
		iWidth = newWidth;
	}
	
	public void setiLength(int newLength) {
		iLength = newLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		return 2*iLength + 2*iWidth;
	}

	public int compareTo(Object obj) {
		
		
		return 0;
	}
}

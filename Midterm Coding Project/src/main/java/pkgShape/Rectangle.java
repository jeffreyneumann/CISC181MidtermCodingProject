package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int iWidth,int iLength){
		if (iWidth <= 0 || iLength <= 0) {
			throw new IllegalArgumentException("Parameters must be positive");
		}
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
		
	public double area() {
		return(iWidth * iLength);
	}

	public double perimeter() {
		return(2 * iWidth + 2 * iLength);
	}

	public int getiWidth() {
		return(this.iWidth);
	}
	
	public int getiLength() {
		return(this.iLength);
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public int compareTo(Rectangle other) {
		int sortNum = 0;
		if (this.area() > other.area()) {
			sortNum = 1;
		}
		else if (this.area() < other.area()) {
			sortNum = -1;
		}
		return sortNum;
	}
}

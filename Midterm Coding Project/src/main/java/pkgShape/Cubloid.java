package pkgShape;

import java.util.*;

public class Cubloid extends Rectangle {
	
	private int iDepth;
	
	public Cubloid() {
		super();
	}
	
	public Cubloid(int iDepth, int iWidth, int iLength) {
		super(iWidth,iLength);
		
		if (iDepth <= 0) {
			throw new IllegalArgumentException("Parameter must be positive");
		}
		this.iDepth = iDepth;
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return(getiWidth() * getiLength() * iDepth);
	}
	
	@Override
	public double area() {
		return(2 * getiWidth() * getiLength() + 2 * getiWidth() * iDepth + 2 * iDepth * getiLength());
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter operation is not supported for cubloid");
	}
	
	public int compareTo(Cubloid other) {
		int sortNum = 0;
		if (this.volume() > other.volume()) {
			sortNum = 1;
		}
		else if (this.volume() < other.volume()) {
			sortNum = -1;
		}
		return sortNum;
	}
}


package pkgShape;

import java.util.Comparator;

public class SortbyArea extends Cubloid implements Comparator<Cubloid> {
	
	public int compare(Cubloid C1, Cubloid C2)
    { 
        return (int)(C1.area() - C2.area()); 
    } 
} 

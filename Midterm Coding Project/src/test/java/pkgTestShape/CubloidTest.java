package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.*;

import java.util.*; 
 
public class CubloidTest {

	@Test
	public void CubloidTest() {
		try {
			Cubloid C = new Cubloid(2,2,2);
		} catch (Exception e) {
			fail("Test failed to build a Cubloid");
		}
	}
	
	@Test
	public void getiDepthTest() {
		Cubloid C = new Cubloid(2,3,4);
		if (C.getiDepth() != 2) {
			fail("Test failed to get iDepth");
		}
	}
	
	@Test
	public void setiDepthTest() {
		Cubloid C = new Cubloid(2,3,4);
		C.setiDepth(6);
		if (C.getiDepth() != 6) {
			fail("Test failed to set iDepth");
		}
	}
	
	@Test 
	public void areaTest() {
		Cubloid C = new Cubloid(2,2,2);
		if (C.area() != 24) {
			fail("Test failed to calculate area");
		}
	}
	
	@Test
	public void PerimeterTest() {
		boolean fail = true;
		Cubloid C = new Cubloid(2,2,2);
		double perimeter;
		try {
			perimeter = C.perimeter();
		} catch (Exception UnsupportedOperationException) {
			fail = false;
		} finally{
			if (fail)
				fail("Test failed to attempt to calculate perimeter");
		}
	}
	
	@Test
	public void CubloidTest1() {
		boolean fail = true;
		try {
			Cubloid C = new Cubloid(-2,2,2);
		} catch (Exception IllegalArgumentException) {
			fail = false;
		} finally{
			if (fail)
				fail("Test failed to build a Cubloid");
		}
	}
	
	@Test
	public void SortbyAreaTest() {
		boolean result = false;
		
		ArrayList<Cubloid> ar = new ArrayList<Cubloid>(); 
        ar.add(new Cubloid(3, 3, 3)); 
        ar.add(new Cubloid(2, 3, 4)); 
        ar.add(new Cubloid(2, 2, 2)); 
        
        Collections.sort(ar, new SortbyArea());
        
        ArrayList<Cubloid> arSorted = new ArrayList<Cubloid>(); 
        arSorted.add(new Cubloid(2, 2, 2)); 
        arSorted.add(new Cubloid(2, 3, 4)); 
        arSorted.add(new Cubloid(3, 3, 3));
        
        for (int i=0; i<ar.size(); i++) {
        	if (arSorted.get(i).area() != ar.get(i).area()) {
        		result = true;
        		break;
        	}
        }
        
        if (result) {
        	fail("Test failed to sort by area");
        }
	}
	
	@Test
	public void SortbyVolumeTest() {
boolean result = false;
		
		ArrayList<Cubloid> ar = new ArrayList<Cubloid>(); 
        ar.add(new Cubloid(3, 3, 3)); 
        ar.add(new Cubloid(2, 3, 4)); 
        ar.add(new Cubloid(2, 2, 2)); 
        
        Collections.sort(ar, new SortbyVolume());
        
        ArrayList<Cubloid> arSorted = new ArrayList<Cubloid>(); 
        arSorted.add(new Cubloid(2, 2, 2)); 
        arSorted.add(new Cubloid(2, 3, 4)); 
        arSorted.add(new Cubloid(3, 3, 3));
        
        for (int i=0; i<ar.size(); i++) {
        	if (arSorted.get(i).volume() != ar.get(i).volume()) {
        		result = true;
        		break;
        	}
        }
        
        if (result) {
        	fail("Test failed to sort by volume");
        }
	}
}

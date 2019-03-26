package pkgShape;

import java.util.Comparator;

public class SortbyVolume extends Cubloid implements Comparator<Cubloid>{
	
	public int compare(Cubloid C1, Cubloid C2) {
		
		return (int)(C1.volume() - C2.volume());
	}
}

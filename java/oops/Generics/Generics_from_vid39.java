package oops.Generics;

public class Generics_from_vid39 <X , Y> {
	
	X x;
	Y y;
	
	public Generics_from_vid39(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDesc() {
		System.out.println(x +" and "+ y);
	}
	
	
}

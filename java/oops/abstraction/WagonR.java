package oops.abstraction;

public class WagonR extends Car{
	
	public void accelerate(){
		System.out.println("WagonR is accelerating");
	}
	
	@Override
	public void braking(){
		System.out.println("WagonR is braking");
	}
}
 
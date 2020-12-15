package oops.abstraction;

public class Repair {

	
//	public static void repairCar(WagonR car){
//		System.out.println("wagonR car is repaired");
//	}
//	
//	public static void repairCar(Audi car){
//		System.out.println("audi car is repaired");
//	}
//	
	
	public static void repairCar(Car car) {
		System.out.println("car is repairing...") ;
	}
	
	
	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repairCar(wagonR);
		repairCar(audi);
		
		
		
		
	}
}

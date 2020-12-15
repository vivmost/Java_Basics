package oops;

class cat {
	int eyes , legs ;
	boolean hasFur;
	String color , size;
	
	public void eat(){
		System.out.println("cat is eating ");
	}
	 public void run() {
		 System.out.println("cat is running ");
	 }
	 
	 public void description() {
		 System.out.println("the cat has " + eyes + " eyes and " + legs + " legs. " );
	 }
}



public class Main_Class_And_Objects {
	public static void main(String[] args) {
		
		cat cat1 = new cat();
		
		cat1.eat();
		cat1.run();
		
		cat1.eyes = 2;
		cat1.legs = 4;
		
		cat1.description();
		
	}

}

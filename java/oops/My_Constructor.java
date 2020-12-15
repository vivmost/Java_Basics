package oops;

class car{
	int wheels;
	String color;
	int headlights;
	int noOfWindows;
	
                                                                          //	contructor
	car(int wheels , String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
	
	car(int wheels , int noOfWindows ){
		this.wheels = wheels;
		this.noOfWindows = noOfWindows;
	}
}

public class My_Constructor {

	public static void main(String[] args) {
		
                                                                      //		        objects
		car honda = new car(4 , "yellow");
		System.out.println(honda.wheels + "  " + honda.color);
		
	
		
		
		
	}

}

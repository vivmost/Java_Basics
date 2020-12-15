package oops.final_keyword.Final_method;

public class Student {

	int rollNO;
	String name;
	
	public final void getDescription() {
		System.out.println("this student is , " + name);
	}
}

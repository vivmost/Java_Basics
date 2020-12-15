package oops.Inheritance;

public class Upcasting_and_Downcasting_1 {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		Singer s1 = new Singer();
		Person p1 = t1;                      // upcasting or implicit casting
	    Teacher t2 = (Teacher) p1;              // downcasting or explicit casting               
		
		boolean yo = t1 instanceof Teacher;
		System.out.println(yo);
		
		System.out.print("\n");
		
//		or can be done directly as
		
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Teacher);
		System.out.println(t2 instanceof Person);
		System.out.println(t2 instanceof Teacher);
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Singer);
		
		System.out.print("\n");
		
		System.out.println(p1 instanceof Singer);

	}

}

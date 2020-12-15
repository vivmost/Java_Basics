package oops.final_keyword;

public class Student {

		final int roll_no;
		final String name;
		final int age;
		
		
		{
			roll_no = 7;
					
		}
		
		public Student() {
			name = "vivmost";
			age = 34;
		}
		
//		if in a static class then can also use this 3rd method for initializing the final variable
//		static {
//			age = 67;
//		}
		
		
}

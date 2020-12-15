package Exception_Handling;

public class Throw_Keyword {
	public static void main(String[] args) {
		
		fun1();
	}

	static void fun1() {
		int a = 5;
		int b = 8;
		int c = a/b;
		System.out.println(c);
		
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was found , and this is my exception");
			
		}
	}
	
	
}


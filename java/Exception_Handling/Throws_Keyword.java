package Exception_Handling;

public class Throws_Keyword {
	public static void main(String[] args) {
		
		fun1();
	}

	
	static void fun1() {
		int a = 5;
		int b = 8;
		int c = a/b;
		System.out.println(c);
	
		try {
			Thread.sleep(3000);
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("so, this is it.");
		}
	}
		
		
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was found , and this is my exception");
		}
		
		
	}
}


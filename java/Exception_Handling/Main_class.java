package Exception_Handling;

public class Main_class {
	public static void main(String[] args) {
		
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage() + "occured");
		}finally {
			System.out.println("final imp. must run");
		}
		
	}

}

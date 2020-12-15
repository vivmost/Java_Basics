package conditional_Statements;

public class Nested_Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 12 , b = 8 , c = 10 ;
//	
//	if(a>b) {
//		if(a>c) {
//			System.out.println("biggest is a ");
//		}else {
//			System.out.println("biggest is c");
//		}
//	}else {
//		if(b>a) {
//			System.out.println("biggest is b");
//		}else {
//			System.out.println("c is biggest");
//		}
//	}
          
	
	
	
	
	
	
	                   //second method
	
	
    int result = 0;	
//	if(a>b) {
//		if(a>c) {
//			result = a;
//		}else {
//			result = c;
//		}
//	}else {
//		if(b>a) {
//			result = b;
//		}else {
//			result = c;
//		}
//		
//	}
//	System.out.println("the biggest no. is " + result);
//	
//	
	
	
	
                     			//third method
	result = a>b ? a>c ? a:c: b>c ? b:c;
	System.out.println("the greatest no. is " + result);
	
	
	
	}
}

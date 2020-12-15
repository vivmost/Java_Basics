package conditional_Statements;

public class Switch_Case {

	public static void main(String[] args) {
	int weekday = 2;
		switch(weekday) {
//		in this way we can merge 2 cases in switch
		
		case 1: 
		case 2:                     
			System.out.println("monday it is ");
			break;

		case 3:
			System.out.println("wednesday it is ");
			break;
			
			default : 
				System.out.println("i don't know what day it is. ");
				break;
		}
		
		
		
//		second method
//		int weekday = 2;
//		switch(weekday) {
//		case 1: 
//			System.out.println("monday it is ");
//			break;
//			
//		case 2:
//			System.out.println("tuesday it is ");
//			break;
//
//		case 3:
//			System.out.println("wednesday it is ");
//			break;
//			
//			default : 
//				System.out.println("i don't know what day it is. ");
//				break;
//		}
//		
//		
	}

}

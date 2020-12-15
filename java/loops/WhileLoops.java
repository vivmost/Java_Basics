package loops;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
	
		
//		                              taking input as n        
		
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the no. ");
	int n = sc.nextInt();
	
	
	
	
//	                                     Q.1 sum of the digits
	
//	int temp = n;
//	int result = 0;
//	
//	while(temp>0) {
//		int lastDigit = temp%10;
//		temp /= 10;
//		
//		result += lastDigit;
//	}
//	System.out.println("ans is " + result );
//	
//	
	
	
	
//                                        Q.2 Paliandrome no.
	int temp = n ;
	int reversedNumber = 0;
	
	while(temp>0) {
		int lastDigit = temp%10;
		temp /= 10 ;
		reversedNumber = reversedNumber * 10 + lastDigit ;
		
	}
	if(reversedNumber == n ) {
		System.out.println("it's a paliandrome no. ");
	}else {
		System.out.println("not a paliandrome no. ");
	}
	
	
	
	
	
	
	
	}

}

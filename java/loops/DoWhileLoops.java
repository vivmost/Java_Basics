package loops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
	
		
//		     example 1 
		
//		 int n = 0;
//		 
//		do {
//			System.out.println(" n is "+ n);
//			n--;
//		}while(n > 0);
//		
//		
		
		
//		                           example 2 
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" enter the no. ");
//		int n = 1;
//
//		do {
//			n = sc.nextInt();
//		}while(n>0);
//		
		
		
//                                     		 until user enters -ve no.
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no. ");
		int n = 0;

		do {
			n = sc.nextInt();
		}while(n>=0 );
		
		
		
		
		
		
		
		

	}

}

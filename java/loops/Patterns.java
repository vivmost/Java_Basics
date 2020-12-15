package loops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		
//		                                    PATTERN 1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ' n ' ");
//		int n = sc.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				System.out.print("* ");
//
//			}
//			System.out.println();
//			}
//			
		
		
		
//		                              PATTERN 2 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 'n ' " );
//		int n = sc.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
//		
		
		
		
		
//		                  PATTERN 3 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 'n ' " );
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i - 1; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= n - i + 1; j++) {
//				System.out.print("* ");
//			}
//
//			System.out.println();
//
//		}
//		
		
		
		
		
//		                              PATTERN 4
		
//	Scanner sc = new Scanner(System.in);
//	System.out.println(" enter n ");
//	int n = sc.nextInt();
//	
//	for(int i = 1 ; i<=n ; i++) {
//		for(int j = 1; j<=n-i+1 ; j++ ) {
//		System.out.print("* ");
//		}
//	System.out.println();	
//		}
//	
		
		
		
		
//		                                      PATTERN 5
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" enter n ");
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1 ; j <= n-i ; j++) {
//				System.out.print("  ");
//			}
//			for( int k =1 ; k <=i ; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
//		                                       PATTERN 6 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 'n' " );
//		int n = sc.nextInt();
//		
//		for(int i = 1; i<=n ; i++) {
//			for(int j=1 ; j<= n-i ; j++) {
//				System.out.print("  ");
//			}
//			for(int k = 1; k<=i ; k++) {
//				System.out.print("x   ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
//		                                          PATTERN 7 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 'n' " );
//		int n = sc.nextInt();
//		int result = 0;
//		
//		for(int i=1 ;i<=n ; i++) {
//			for(int j =1 ; j<= n-i ; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1 ; j<= i ; j++) {
//                result++   ;                                    //				 result += 1;
//				System.out.print(result+ "   ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		                                         PATTERN 8
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 'n' ");
		int n = sc.nextInt();
		
		int rows = 2 * n - 1;
		
		for(int i=1; i<= rows ; i++) {
			if(i<=n) {
				for(int j=1; j<= i; j++) {
					System.out.print("* ");
				}
			}else {
				for(int j=1; j<= rows -i +1 ; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
//		                                       PATTERN 9

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 'n' ");
//		int n = sc.nextInt();
//		
//		System.out.println("*");
//		
//		for(int i =2; i<=n-1 ; i++) { 
//			System.out.print("* ");
//			for(int j=1; j<= i-2 ; j++) {
//				System.out.print("  ");
//			}
//			System.out.print("*");
//			System.out.println();
//		}
//		if(n>1) {
//			for(int j=1; j<=n ; j++) {
//				System.out.print("* ");
//			}
//			
//		}
//		

		
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

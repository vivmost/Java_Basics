package Practice;

import java.util.Scanner;

public class Loops_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. 'n' ");
		int n = sc.nextInt();
		
		
//		                                               PATTERNS
//		                                                 Q.1
//		for(int i =0 ; i<n ; i++) {
//			for(int j =0 ; j<i ; j++) {
//				System.out.print("  ");
//			}
//		    for (int j = 0; j < n-i; j++) {
//		    	System.out.print("x ");
//		    }
//		    System.out.println();
//		}
		
		
		
		
//		                                                 Q.2
		for(int i =0 ; i<n ; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("    ");
			}
			for(int j = 0; j<n-i; j++) {
				System.out.print("x ");
			}
			System.out.println();
					}
		
		
		
		
		
//		                                      Q.3
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n-1-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j = 0; j<i+1; j++) {
//				System.out.print("x   ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
//		                                              Q.4 
//		for(int i =0; i<2*n-1; i++) {
//			if(i < n) {
//			for(int j=0; j<n-1-i ; j++) {
//			System.out.print("  ");	
//			}
//			for(int j=0; j<i+1; j++) {
//				System.out.print("x ");
//			}
//			}else {
//			for(int j = 0 ; j < i - n + 1 ; j++  ) {
//				System.out.print("  ");
//			}
//			for(int j = 0; j< 2*n- 1 - i ; j ++) {
//				System.out.print("x ");
//			}
//			
//			
//			}
//			System.out.println();
//		}
		 
		
		
		
		
		
//		                                                Q.5
//		int rows = 2*n + 1;
//		int condition = 2*n -2;
//		for(int i=0; i<rows; i++) {
//			
//			if(i< condition) {
//				for(int j=0; j<n-i; j++) {
//					System.out.print("x ");
//				}
//				for(int j=0; j<2*i+1; j++) {
//					System.out.print("  ");
//				}
//				for(int j=0; j<n-i; j++) {
//					System.out.print("x ");
//				}
//			}else {
//				for(int j=0; j<i-3; j++) {
//					System.out.print("x ");
//				}
//				for(int j=0; j <  ; j++) {                    
////					System.out.print("p ");                                        find some solution
//				}
//				for(int j=0; j<i-n ; j++) {
//					System.out.print("x ");
//				}
//			}
//			
//			
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
//		                                                  Q.6
//		int result = 0; 
//		for(int i=0; i<n; i++) {
//			
//			
//			for(int j=0; j<n-i-1; j++) {
//				System.out.print("  ");
//			}
//			for(int j=0; j<i+1 ;j++ ) {
//				result++; 
//				System.out.print(result + "   ");
//			}
//			
//			
//		System.out.println();	
//		}
		
		
		
		
		
		
		
//		                                          Q.7
//		for(int i=0; i<n; i++){
//			for(int j=0; j<n-i-1; j++) {
//				System.out.print("  ");
//			}
//			
//			if(i<1) {
//				System.out.print(i+1);
//			}else{
//				for(int k=0; k<1;k++) {
//					System.out.print(i+1 + " ");
//				}
//				for(int k=0; k<2*i-1;k++) {
//					System.out.print("0 ");
//				}
//				for(int k=0; k<1;k++) {
//					System.out.print(i+1 + " ");
//				}
//			}
//			System.out.println();
//		}
		

		
	 	
		
		
		
//	              	                               Q.8
//		for(int i=0; i<n;i++) {
//			for(int j=0; j<n-i-1;j++) {
//				System.out.print("p ");
//			}
//			
//			if(i<1) {
//			System.out.print("0");	
//			}else {
//				for(int k=n-1; k<i+ n-1; k++) {
//					System.out.print(k);
//				}
//				for(int k=1; k<n; k++) {                                     ......find the ans......
//					System.out.print("0");
//				}
//				for(int k=n-1; k<i+ n-1;k--) {
//					System.out.print(k);
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
//		                                 Q.9
//		for(int i=0; i<n; i++) {
//			if(i<1) {
//			System.out.print("x");	
//			}else if(i<n-1){
//			for(int j=0; j<1; j++) {
//				System.out.print("x ");
//				}
//			for(int j=0; j<i-1; j++) {
//				System.out.print("  ");
//			}
//			for(int j=0; j<1; j++) {
//				System.out.print("x ");
//				}
//			
//			}else {
//			for(int j=0; j<n; j++) {
//				System.out.print("x ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
//		                                         Q.10
//		for (int i=0; i<1;i++) {
//			for(int j=0; j<n-1; j++) {
//				System.out.print("  ");
//			}
//			System.out.println("x ");
//		}
//		for(int i=0; i<n-2; i++) {
//			for(int j=0; j<n-i-2; j++) {
//				System.out.print("  ");
//			}
//			for(int j=0; j<1; j++) {
//				System.out.print("x ");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=0; j<1; j++) {
//				System.out.print("x ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<n; i++) {
//			System.out.print("x ");
//		}
		
		
		
		
		
		
		
		
		
		
	}

}

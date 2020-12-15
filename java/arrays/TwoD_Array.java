package arrays;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		
		
//		                                    assigning of 2-d array 
//		int a [][] = new int[5][3];

		
//		                                    accesing values in 2-d array 
//		int a [][] = new int [5][3];
//		System.out.println(a[2][1]);
				
		
		
//		                                    initialisation in 2-d array 
//		int a [][] = {
//				{1,2,3},
//				{5,6,8,0,4},
//				{1,6,76,4,43,67}
//		};
//		System.out.println(a[2][2]);
//		
		
		
		
//		                                eg.1 (matrix addition) 
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter ' rows ' ");
		int rows = sc.nextInt();
		
		System.out.println(" enter ' columns ' ");
		int columns = sc.nextInt();
		
		
				int a [][]  = new int[rows][columns];
				int b [][]  = new int [rows][columns];
				
				System.out.println(" enter for matrix 'a' ");
				for(int i =0 ; i<rows ; i++) {
					for(int j = 0 ; j<columns ; j++) {
						a [i][j] = sc.nextInt();
					}
					System.out.println();
				}
				System.out.println();
				
				
				System.out.println(" enter for matrix 'b' ");
				for(int i =0 ; i<rows ; i++) {
					for(int j = 0 ; j<columns ; j++) {
						b [i][j] = sc.nextInt();
					}
					System.out.println();
					
				}
				System.out.println();
				
				
			 int c[][] = new int [rows][columns];
			 System.out.println(" the sum of the matrix is : ");
				for(int i =0 ; i<rows ; i++) {
					for(int j = 0 ; j<columns ; j++) {
						c [i][j] = a[i][j]  + b[i][j];
						System.out.print(c[i][j] + " ");
					}
					System.out.println();
				}
				
				
				
				
				
				
	}

}

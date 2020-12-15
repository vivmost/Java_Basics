package arrays;

import java.util.Scanner;

public class Arrays_In_Java {

	public static void main(String[] args) {
		
//                                              ARRAYS ACCESS SYNTAX

		
// 	 int[] marks ;
//	 marks  = new  int[5];
//                             //	 or                                    int[] marks = new int[5];
//	 System.out.println(marks[4]);
//	 
		
		
		
//		                                      ARRAYS INITIALISATION 
		
//		int[] marks = {1 , 2,  4, 8 , 9};
//		float [] percent = {3.13f , 4.3f ,32.6f};
//		double [] percentile = {54.5 , 43.56};
//		marks[0] = 98;
//		System.out.println(marks[0]);
//		System.out.println(percent[2]);
//		System.out.println(percentile[1]);
//		
//		
//		
		
		
		
		
//		                                  eg. 1 
//		int[] age = {1,4,6,3,4};
//		
//		for(int i =0 ; i<age.length ; i++) {
//			System.out.println(age[i]);
//		}
//		

		
		
//		                                   eg. 2 (avg. marks of students)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of students 'n' ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		
		for(int i = 0; i<n ; i++) {
			System.out.println(" enter the marks ");
			marks[i] = sc.nextInt();
		}
		int average = 0;
		for(int  i= 0 ; i<n ; i++) {
			average += marks[i];
		}
		average /= n;
		
		System.out.println(" the avg is " + " '' " + average + " '' ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

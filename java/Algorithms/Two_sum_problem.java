package Algorithms;

import java.util.Scanner;

public class Two_sum_problem {
	
	public static boolean twoSum(int a[] , int x) {
		int i=0 , j = a.length-1;
		
		while(i<j) {
			if(a[i] + a[j] > x) {
				
				j--;
			}else if(a[i] + a[j] < x) {
				i++;
			}else {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'x' " );
		int x = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(twoSum(arr , x));
		
		
		
	}

}

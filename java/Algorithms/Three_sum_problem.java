
// RESOLVE THIS ERROR



package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Three_sum_problem {

	
	public static boolean findTriplets(int arr[], int n) {
		Arrays.sort(arr);
		
		for(int i=0; i<n-2 ; i++) {
			if(two_sum(arr, -arr[i], i+1)) {
				return true;
			}
			return false;
		}
		
		
		
	public boolean two_sum(int a[], int x, int i) {
			int j = a.length -1;
		
		while(i<j) {
			
			if(a[i]+ a[j] > x) {
				j--;
			}else if(a[i] + a[j] < x) {
				i++;
			}else {
				return true;
			}
		}
		
	}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'n' here ");
		
		int n = sc.nextInt();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(findTriplets(arr , n));
		
		
		
	}

}

package arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int a[] = {2, 8, 5, -4,-2 };
		int n = a.length;
		for(int i= 0 ; i<n-1; i++) {
			int minInt = i;
			for(int j =i; j<n ; j++) {
				if(a[j] < a[minInt]) {
					minInt = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInt];
			a[minInt] = temp;
		}
		for(int e: a) {
			System.out.print(e +" ");
		}
		

		
		
		
		
		
		
		
	}

}

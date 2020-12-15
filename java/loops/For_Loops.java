package loops;
import java.util.Scanner;
public class For_Loops {

	public static void main(String[] args) {
		
//		int i = 0;
//		for (i = 0 ; i<=100  ; i+=2) {
//			System.out.println("print "+ i  );
//		}
		
		
		
                  //arithmatic progression
//		int  n = 5;
//		int sum = 0;
//		for (int i = 1 ;   i<=n ; i++ ) {
//			sum = sum+i;
//		}
//		System.out.println("arith. prog. is " + sum);
 
		
		
		
                             //tables 
//		int n = 2;
//		int table  = 0;
//		System.out.println("table of 2 is :- ");
//		for ( int i = 1 ; i<=10 ; i++) {
//			table = n*i;
//			
//			System.out.println(table);
//		}
                            //short way of tables		
//		int tableOf = 4;
//		for(int i = 1 ; i<=10 ; i++) {
//			System.out.println(tableOf * i );
//		}

		
		
		
                     //factorial 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number ");
//		
//		int n = sc.nextInt();
//		int result = 1;
//		for (int  i =1; i<=n ; i++) {
//			result = result*i;
//		}
//		System.out.println("The factorial of " + n + " is " + result+".");
//		
		
		
		
                 
//		                          fabonacci series
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no.");
//		int n = sc.nextInt();
//		int a= 0;
//		int b = 1;
//		System.out.print(0 + " ");
//		System.out.print(1 + " ");
//		int result =0;
//		for(int i=0 ; i<n-2 ; i++) {
//			result = a+b;
//			a = b;
//			b = result;
//			System.out.print( result + " ");
//		}
//		
//		
//		
		
		
//		                          a^b (raised to power)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no. a");
//     	int a = sc.nextInt();
//     	System.out.println("enter the no. b");
//     	int b = sc.nextInt();
//     	
//     	int result = 1;
//     	
//     	for(int i = 1 ; i<=b ; i++) {
//     		result = result*a;
//     	}
//     	System.out.println("the ans. is " + result);
//		
//		
		
		
		
		
//		                     prime no.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no. ");
//    	int n = sc.nextInt();
//    	boolean isPrime = true;
//                                                 //    	for only one statement don't need {}.
//    	if (n<2) isPrime = false;
//      	
//    	for(int i=2 ; i<n  ; i++ ) {
//                                        //       or the condition can be (i*i <= n ) or (i^2 <= n)
//    		if(n%i == 0) {
//    			isPrime = false;
//    			break;
//    			
//    		}
//    		
//    	}
//		System.out.println("is this prime " +    isPrime);
//
//    	
    	
    	
    	
    	
                 // adiition of a series    	
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("enter the number ");
//    	int n= sc.nextInt();
//    	float result = 1f;
//    	for (float i =2; i<=n; i++) {
//    		result += 1/i;
//    	}
//    	System.out.println("the sum is " + result);
//    	
//    	
//    	
    	
		
		
		
    	
                       //sum of 2 series 
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter the number ");
    	int n= sc.nextInt();
    	float result = 0f;
    	
    	for(float i=1 ; i<=n; i++) {
 
    		if(i % 2 == 0) {
    			result -= 1/i;
    		}else {
    			result += 1/i;
    		}
    		
    	}
    	System.out.println("the result is " + result);
    	
    	 
    	
    	
    	
    	
    	
	}
}

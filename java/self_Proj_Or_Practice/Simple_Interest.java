package self_Proj_Or_Practice;
import java.util.Scanner;
public class Simple_Interest {

	public static void main(String[] args) {
		// simple rate of interest
		Scanner sc = new Scanner(System.in);
		
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principle * rate * time / 100;
		
		System.out.println("the simple interest is " +simpleInterest);

	}

}


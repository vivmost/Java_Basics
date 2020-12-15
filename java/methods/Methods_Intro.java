package methods;

import java.util.Scanner;

class Dog{
	int legs;
}

public class Methods_Intro {

	public static void main(String[] args) {
		
		Dog c = new Dog();
		c.legs = 3;
		
		Dog d = new Dog();
		d.legs = 0;
                                                                        //		1st output
		swap(c,d);
		System.out.println(c.legs +  " " + d.legs);
		
                                                                       //		2nd output
        Dog x = new Dog();  
		changeDog(x);
          System.out.println(x.legs);
          
                                                                     //          even no. output
          int p = 0;
          int result = evenNo(p);
          System.out.println(result);
                                                                       //           other method for even no. output
		
	}
	static void swap(Dog a , Dog b) {
		Dog temp = a;
				a = b;
				b=temp;
	}
	
	static void changeDog(Dog dog) {
		dog.legs = 7;
	}
	
	static int evenNo(int a) {
		System.out.println(" enter the no. 'n' ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			return n;
		}else {
			return n+1;
		}
	}
}

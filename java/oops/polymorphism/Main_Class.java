package oops.polymorphism;

public class Main_Class {
	
//	public static void greetings() {
//		System.out.println(" hi , there ");
//	}
//	
//	public static void greetings(String s) {
//		System.out.println(s);
//	}
//	
//	public static void greetings(String s , int count) {
//		for(int i=0; i<count; i++) {
//			System.out.println(s);
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		Run time polymorphism
		
		Dog d = new Dog();
		Pet p = d;
		
		d.walk();
		p.walk();
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		
		
		
		
//		compile time polymorphism
//		greetings("vivmost");
//		
//		greetings("vivek" , 5);
//		
//		
		
		
	}

}

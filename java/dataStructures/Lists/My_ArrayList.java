package dataStructures.Lists;
import java.util.List;
import java.util.ArrayList;
import oops.Generics.Generics_from_vid39;


public class My_ArrayList {

	public static void main(String[] args) {
		
//		creating ArrayList
		List <String> fruits = new ArrayList<>();
		
//		method to add into ArrayList
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		
		
//		use of Generics in ArrayList 
		Generics_from_vid39 <Integer, String> p1 = new Generics_from_vid39 (3, "vivmost");
		p1.getDesc();
		

	}

}

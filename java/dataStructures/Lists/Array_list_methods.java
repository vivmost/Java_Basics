package dataStructures.Lists;

import java.util.List;
import java.util.ArrayList;

public class Array_list_methods {
	public static void main(String[] args) {
		List <String> fruits = new ArrayList<>();
		List<String> vegetables = new ArrayList<>();
//	add	
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("orange");
		
		vegetables.add("potato");
		vegetables.add("chllies");
		vegetables.add("tomamto");
		

//		addAll
		fruits.addAll(vegetables);
		System.out.println(fruits);
		
//       get
		System.out.println(fruits.get(3));
		
//    set
		fruits.set(3,"brinjal");
		System.out.println(fruits.get(3));
		
//    remove
		fruits.remove(3);
		System.out.println(fruits.get(3));
		
//    remove all
		fruits.removeAll(vegetables);
		System.out.println(fruits);
		

//		clear
		vegetables.clear();
		System.out.println(vegetables);
		
// size
		fruits.size();
		System.out.println(fruits);
		
//   contains 
		System.out.println(fruits.contains("cucumber"));
		
//   isEmpty
		System.out.println(fruits.isEmpty());
		
//   toArray
		
//                                                 //this makes array of object , not our specified datatype		  
//		System.out.println(fruits.toArray());
//		
		
                                                 //	to create a string of array
		String[] temp = new String [fruits.size()];
		fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
		

	}

}

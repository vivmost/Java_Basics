package oops.My_interface;

public class Person_main implements Youtuber , Student {
	public static void main(String[] args) {
		
		Person_main obj = new Person_main();
		obj.study();
		obj.make_video();
		
//		we can also assign different obj name to old one , but this only follows functions of youtuber only
		Youtuber obj2 = obj;
		obj2.make_video();
		
//		can't do this 
//		obj2.study();
		
		
	}
	
	@Override
	public void study() {
		System.out.println("student studies");
	}
	
	@Override
	public void make_video() {
		System.out.println("making a video");
	}

}

package Javac;


import java.util.HashMap;
import java.util.Map;

public class LearnJava2 {
	
	public static void main(String []args) {
		
		
//		HashMap<String, String> obj = new HashMap<String, String>();
//		obj.put("601", "Makesh");
//		obj.put("602", "Teena");
//		obj.put("400", "Mukesh");
//		obj.put("300", "Raman");
//		obj.put("600", "Dhaman");
//		obj.put("700", "Chaman");
//		obj.put("700", "Rakesh");
//	    System.out.println(obj);
//		System.out.println(obj.get("900"));
//		
//		for(Map.Entry<String, String> data : obj.entrySet()) {
//			System.out.println("Key is "+data.getKey() + " " + "value is "+data.getValue());
//		}
		
		
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("601", "Makesh");
		obj.put("602", "Teena");
		obj.put("400", "Mukesh");
		obj.put("300", "Raman");
		obj.put("600", "Dhaman");
		obj.put("700", "Chaman");
		obj.put("700", "Rakesh");
	    System.out.println(obj);
		System.out.println(obj.get("900"));
		
		for(Map.Entry<String, String> data : obj.entrySet()) {
			System.out.println("Key is "+data.getKey() + " " + "value is "+data.getValue());
		}
	}
	

}
 
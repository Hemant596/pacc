package Javac;

import java.util.ArrayList;

public class LearnJava {
	
	public static void main(String []args) {
		
		ArrayList obj = new ArrayList();
		obj.add('M');
		obj.add("Mentor");
		obj.add(17.54);
		obj.add(87878787);
//		System.out.println(obj);
//		System.out.println(obj.get(4));
		for(Object it : obj) {
			System.out.println("output is "+it);
		}
		
	}
	

}

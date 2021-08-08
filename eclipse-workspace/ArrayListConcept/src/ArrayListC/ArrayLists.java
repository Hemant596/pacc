package ArrayListC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,7,8,9,3,4,5,6,7,8,9,10));
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ar.add(11);
		ar.add(2);
		ar.add(13);
		ar.add(14);
		ar.add(15);
		ar.add(16);
		//System.out.println(ar);
//		ar.removeIf(num -> !(num%2==0));
//		System.out.println(ar);
//		ar.retainAll(Collections.singleton(2));
//		System.out.println(ar);
//		ArrayList<Integer> ar1 = new ArrayList<Integer>(ar.subList(3, 14));
//		System.out.println(ar1);
		
		
		Object ds[] = ar.toArray();
		//System.out.println(Arrays.toString(ds));
		for(Object o : ds) {
			System.out.print(o+" ");
		}
		System.out.println("------------");
		
		Iterator<Integer> ab = ar.iterator();
		while(ab.hasNext()) {
			System.out.print(ab.next()+" ");
		}
		
		
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		ar.add(54);
//		ar.add(55);
//		ar.add(56);
//		ar.add(57);
//		//ar.add("hemant");
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("hemant");
//		//arr.add(12.0);
//		ArrayList<Double> arD = new ArrayList<Double>();
//		arD.add(12.3);
//		
//      
//		
////		Iterator<Integer> ns = ar.iterator();
////      while(ns.hasNext()) {
////    	  System.out.println(ns.next());
////      }
//		ArrayList<Integer> ds = new ArrayList<Integer>(Arrays.asList(10,20,304,54));
//		System.out.println(ds);
//		ArrayList<String>  da = new ArrayList<String>(Arrays.asList("Alpha","Beta","Gamma","Practicle","real"));
//		System.out.println(da);
//		da.remove(0);
//		System.out.println(da);
//		da.add(0, "hemant");
//		System.out.println(da);
//		System.out.println(da.clone());
//		System.out.println(da.get(4));
		
		
//		Iterator<String> ab = da.iterator();
//		while(ab.hasNext()) {
//			System.out.print(ab.next()+" ");
//		}
//		System.out.println("-------------");
//		Object ds[] = da.toArray();
////		System.out.println(Arrays.toString(ds));
//		for(Object o : ds) {
//			System.out.print(o+" ");
//		}
		
		Iterator<Integer> abc = ar.iterator();
		while(abc.hasNext()) {
			System.out.println(abc.next());
		}
		
		Object obc[] = ar.toArray();
		System.out.println(Arrays.toString(obc));
		for(Object e : obc) {
			System.out.println(e);
		}
		
		ArrayList<Integer> inc = new ArrayList<Integer>(ar.subList(5, 12));
		System.out.println(inc);
		
		boolean ass = ar.retainAll(Collections.singleton(5));
		System.out.println(ar.size()<1);
		
		arr.removeIf(num -> !(num%2==0));
		
		System.out.println(arr);
		
		ArrayList<String> ap = new ArrayList<String>(Arrays.asList("Tom","Steve","lara","Harry","Tom"));
		ap.removeAll(Collections.singleton("Tom"));
		System.out.println(ap);
	}
	

}

package Test;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.sun.org.apache.bcel.internal.util.Class2HTML;
import com.sun.tools.javac.code.Attribute.Class;

public class First {

	public static void main(String[] args) {
		
		
		
		/*System.out.println("Enter a number");
		Scanner sc  = new Scanner(System.in);
		int number = sc.nextInt();
		
		if( number % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}*/
			
   /* int x=7;
    int i;
    for( i=2;i<=x-1;i++)
    	if(x%i == 0)
    		break;
    if(x==i) {
    	System.out.println("Prime Number");
    	}else {
    		System.out.println("Not a prime number");
    	}*/
    	
		
		/*int i;
		System.out.println("Enter a number");
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		for( i=2;i<=number-1;i++)
	    	if(number%i == 0)
	    		break;
	    if(number==i) {
	    	System.out.println("Prime Number");
	    	}else {
	    		System.out.println("Not a prime number");
	    	}*/
		
		/*System.out.println("Please enter your name and age");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("Name is " + name + " Age is " + age);*/
		
		/*Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter height of the triangle");
		double height = sc.nextDouble();
		
		System.out.println("Enter base of the triangle");
		double base = sc.nextDouble();
		
		double area = (base * height)/2;
		System.out.println("Area of the triangle : " +area);*/
		
			//int[] arr = {1,2,3,4,5,67,8,9};
			//System.out.println(arr.length);
		
		/*int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int i;
		for(int g : arr)
		System.out.print(g + " ");*/
		
		/*int[] arr = new int[5];
		@SuppressWarnings("resource")
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		
		for(int i=0 ; i<5 ; i++)
		arr[i]	= sc.nextInt();
		for( int i=0;i<5;i++)
			System.out.println("arr["+i+"]= " + arr[i]);*/
		
		//String[] fruit = new String[3];
        //fruit[0] = "mango";
		//fruit[1] = "banana";
		//fruit[2] = "orange";
		//System.out.println(fruit.length);
		
		/*List fruitlist = new ArrayList();
		fruitlist.add("mango");
		fruitlist.add("banana");
		fruitlist.add("orange");
		fruitlist.add("lemon");
		fruitlist.remove("lemon");
		//fruitlist.clear();
		System.out.println(fruitlist.contains("banana"));
		//System.out.println(fruitlist.length);
		System.out.println(fruitlist);*/
		
		//String name =  "Sultan";
		//System.out.println(name.toLowerCase());
		
		/*exGirl("not good");
		
	}
	public static void exGirl(String s) {
		System.out.println(s);*/
		
		/*List arraylist = new ArrayList<>();
		for(int i =0; i<=5 ; i++) {
			arraylist.add(i);
			//System.out.println(arraylist);
		}
		System.out.println(arraylist);
		arraylist.remove(3);
		arraylist.add(2, 88);
		arraylist.add(2, 88);
		System.out.println(arraylist);
		
		for( int i=0 ; i<arraylist.size() ; i++) {
			System.out.print(arraylist.get(i) + " ");
		}*/
		
		/*List<String> list = new LinkedList<>();
		list.add("B");
		list.add("G");
		((LinkedList<String>) list).addFirst("A");
		((Deque<String>) list).addLast("M");
		list.add(2,"K");
		list.remove("M");
		list.remove(3);
		((LinkedList<String>) list).removeFirst();
		((LinkedList<String>) list).removeLast();
		
		System.out.println(list);*/
		
		//Set hashset = new HashSet();
		//hashset.add("Bo");
		//hashset.add("Yo");
		//System.out.println(hashset);
		//boolean r1 = hashset.add("C");
		//System.out.println(r1);
		//boolean r2 = hashset.add("C");
		//System.out.println(r2);
		//System.out.println("List contain C or not ?" + hashset.contains("C"));
		//for(int i = 1 ; i<2 ; i++) {
			//System.out.println(hashset);
		//}
			
		//Shirt s = new Shirt("White", 'M');
		//s.putOn();
		//s.takeOff();
		//s.setSize('M');
		//s.setColor("White");
		//System.out.println(s.color);
		//System.out.println(s.size);
		
		
		/*Pie t = new Pie();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious : ");
		double radius = sc.nextDouble();
		double area = (t.i) * (radius*radius);
		System.out.println(area);*/
		
		Class2 cl = new Class2();
		cl.x = 5;
		cl.y = 6;
		
		System.out.println(cl.x);
		
		
	}

	

	

}

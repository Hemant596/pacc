package Test;

public class Shirt {
	public static String color ;
	public static char size;
	
	Shirt(String newColor, char newSize){ 
		color = newColor;
		size = newSize;
		//newColor = color;
		//newSize = size;
		
	}
	public static void putOn() {
		System.out.println("Shirt is on");
	}
	public static void takeOff() {
		System.out.println("Shirt is Off");
	}
	public static void setColor(String newColor) {
		color = newColor;
	}
	public static void setSize(char setSize) {
		size = setSize;
	}
}

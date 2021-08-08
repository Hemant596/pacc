
public class Calc {
	
	
/*	public Calc() {
		this("Hemant");
		System.out.println("Driver1");
	}
	
public Calc(String name) {
		this(10);
		System.out.println("Driver1 "+name);
	}

public Calc(int count) {
	
	System.out.println("Driver1 "+count);
}

public void display() {
	
	System.out.println("Driver1");
}

	public static void main(String []args) {
		Calc c=new Calc();*/
	
	
	
	int a;
	int b;
	
	public Calc(int a , int b){
		this.a=a;
		this.b=b;
		
	}	
		
	public static void main(String []args) {
		Calc c =new Calc(8,9);
		c.show();
		
	}
	
	public void  show() {
		System.out.println("addition is :"+a +" and "+ "subtraction is :"+b);
	}
		}
	
	
	



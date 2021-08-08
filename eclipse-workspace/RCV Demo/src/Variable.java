
public class Variable {
     
	public static void main(String[] args) {
		
		
		Variable v = new Variable();
		v.add(20, 30);	
		v.add(70);
		v.add(12.2, 23.3);
		v.add("flora public school");
		
			
}                                                      
public void add(int a , int b) {
	int c=a+b;
	System.out.println("the sum of two number is /:"+c);
}
public Variable() {
	
	System.out.println("the sum of two number is /:");
}
public void add(String schoolname) {
	System.out.println("the sum of two  is /:"+schoolname);
}
public void add(double z, double y) {
	double x = z+y;
	System.out.println("the sum of two number is /:"+x);
}
public void add(int a) {
	System.out.println("the sum of two number is /:"+a);
}
}
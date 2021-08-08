package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Ram","SRam","DRam","FRam"));
		ar.add("Jetha");
		ar.add("Lal");
		System.out.println(ar);
		
		int[] ar1 = new int[9];
		ar1[0]=8;
		ar1[1]=56;
		ar1[2]=45;
		ar1[3]=98;
		System.out.println(ar1.length);
		for(int th : ar1) {
			System.out.println(th);
		}
	}

}

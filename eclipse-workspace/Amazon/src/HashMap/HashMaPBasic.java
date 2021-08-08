package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMaPBasic {

	public static void main(String[] args) {
		HashMap<String, String> comp = new HashMap<String, String>();
		comp.put("Nana", "Bhajanpura");
		comp.put("Arun", "Ghaziabad");
		comp.put("Prun", "vijay nagar");
		comp.put("Arun", "Bhajanpura");
		//System.out.println(comp.get("Arun"));
		
		Iterator<String> it = comp.keySet().iterator();
		while(it.hasNext()) {
		String key = it.next();
		String value = comp.get(key);
		System.out.println("Key is :"+key + " and value is :"+value);
		}
		
		
		
		System.out.println("---------");
		
		
		//by using entry set
		Iterator<Entry<String,String>> name =comp.entrySet().iterator();
		while(name.hasNext()) {
			Entry<String,String> entry = name.next();
			System.out.println("key is : "+entry.getKey()+" and value is :"+entry.getValue());
			
			
		}
			
		System.out.println("---------");
		
		
		//USING LAMBDA -- need java 8
		comp.forEach((k,v) -> System.out.println("key is : "+k+ " and value is :"+v));;
		}
	}



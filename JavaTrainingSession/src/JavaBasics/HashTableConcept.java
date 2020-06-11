package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		
		h.put("A","Test");
		h.put("B", "Hello");
		h.put("C","World");
		h.put("1","100");
		h.put("2","300");
		System.out.println("Size of the Hashtable is "+ h.size());
		System.out.println("Value of B is "+h.get("B"));
		
		
		
		

	}

}

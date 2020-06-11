package JavaBasics;

import java.util.ArrayList;

public class ArayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList ();
		
		ar.add(100);
		ar.add("Ram");
		ar.add(12.33);
		ar.add("Raj");
		System.out.println("Size of the Array is "+ ar.size());
		System.out.println("Second & Fourth Value fo the Array " + ar.get(1)+ar.get(3));
		
		ar.remove(2);
		System.out.println("Size of the array is " + ar.size());
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		ArrayList <Integer>ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Ram");
		
		ArrayList <String>ar2 = new ArrayList<String>();
		
		ar2.add("Charan");
		
		
		
		
		
		
		
		

	}

}

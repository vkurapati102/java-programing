package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3]; //Static Array
		
		//Dynamic Array List
		
	//1.Duplicate values can be stored
	//2.It will maintain insertion order
	//3. Not Synchronised ( due to this arraylist is slow compare to other collections)
	//4. Random access to fetch the elements because it stores the values on the basis of index	
	//5.
	ArrayList ar = new ArrayList(); //declaring like this is call generic
	
	ar.add(10);
	ar.add(20);
	ar.add(30);
	System.out.println(ar.size());
	
	ar.add(40);
	ar.add(60);
	ar.add(12.33);
	ar.add("Ram");
	ar.add('c');
	ar.add(true);
	
	
	
	System.out.println(ar.size());
	
	System.out.println(ar.get(4));
	
	// to print all the values of arraylist : use for loop/ Iterator
	
	for(int i=0;i<ar.size();i++) {
		
		System.out.println(ar.get(i));
	}
	
	//Non Generics vs generics 
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>(); // Non-Generics
	
	ar1.add(35);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	
	ar2.add("Raj");
	
	ArrayList<E> ar3 = new ArrayList<E>(); // Non-Generics
	
	ar1.add(35);
	
	//Creating employee objects
	
	Employee e1= new Employee("Ram",23451,"QA");
	Employee e2= new Employee("Ratna",12345,"Developement");
	Employee e3= new Employee("Charan",54321,"Training");
	
	//Creating ArrayList
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	//iterator to traverse the values;
	
	Iterator <Employee>it = ar4.iterator();
	while(it.hasNext()) {
		
		Employee emp = it.next();
		
		System.out.println(emp.name + ","+ emp.empId+"," + emp.dept);
	}
	
	//add All
	
	ArrayList<String> ar5 = new ArrayList<String>();
	
	ar5.add("Seleneium");
	ar5.add("Test");
	ar5.add("Class");
	
ArrayList<String> ar6 = new ArrayList<String>();
	
	ar6.add("Java");
	ar6.add("Cucumbar");
	ar6.add("Junit");
	
	
	ar5.addAll(ar6);
		for(int i = 0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
	}
	
	//removeAll
		ar5.removeAll(ar6);
		for(int i = 0;i<ar5.size();i++) {
		System.out.println(ar5.get(i));
		}
	//retain All
		
		ArrayList<String> ar7 = new ArrayList<String>();
		
		ar7.add("Seleneium");
		ar7.add("Test");
		ar7.add("Class");
		
	ArrayList<String> ar8 = new ArrayList<String>();
		
		ar8.add("Java");
		ar8.add("Seleneium");
		ar8.add("Class");
	ar7.retainAll(ar8);
	
	for(int i = 0;i<ar7.size();i++) {
		System.out.println(ar7.get(i));
		}
	
	
	}

}

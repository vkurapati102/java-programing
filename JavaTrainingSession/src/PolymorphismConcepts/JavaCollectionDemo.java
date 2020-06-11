package PolymorphismConcepts;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionDemo {
	
	public void arrayListDemo() {
		
	//	ArrayList is a Class and List is interface
		
		List<String> arrayListDemo = new ArrayList<String>();
		
		arrayListDemo.add("1");
		arrayListDemo.add("Test");
		
		System.out.println("The First element is "+ arrayListDemo.get(0));
		
		}
	
	public static void main(String[] args) {
		
		
		JavaCollectionDemo jcd = new JavaCollectionDemo();
		jcd.arrayListDemo();
	}
	
	
}

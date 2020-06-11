package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>();

ll.add("Ram");
ll.add("Charan");
ll.add("Ratna");
System.out.println("Contents of the LninkedList:"+ ll);

ll.addFirst("Venkat");
ll.addLast("Raj");
System.out.println("Contents of the LninkedList:"+ ll);

//ll.removeFirst();
//ll.removeLast();

System.out.println("Contents of the LninkedList:"+ ll);
System.out.println(ll.get(0));
ll.set(0,"Kurapati");
ll.set(1, "Shri Guru");

System.out.println("Contents of the LninkedList:"+ ll);

//how to print all the values using for loop

System.out.println("***** For LooP*****");

for(int i = 0; i<ll.size();i++) {
	
	System.out.println(ll.get(i));
}

System.out.println("****Advanced For Loop****");

for(String str:ll) {
	
	System.out.println(str);
}

System.out.println("******Using Iterator*****");

Iterator<String> it = ll.iterator();
while(it.hasNext()) {
	
	System.out.println(it.next());
	
}

System.out.println("*******While Loop******");

int n = 0;

while(ll.size()>n) {
	System.out.println(ll.get(n));
	n++;

}

	}

}

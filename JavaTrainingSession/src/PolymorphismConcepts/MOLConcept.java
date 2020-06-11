package PolymorphismConcepts;

public class MOLConcept {
	
	public void add(int i, int j) {
		
		int k = i+j;
		
		System.out.println("Sum of two numbers:" + k);
		
	}
public void add(int i, int j, int k) {
	
	int l= i+j+k;
	System.out.println("Sum of three numbers :" + l);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MOLConcept MOL = new MOLConcept();
		MOL.add(10,20);
		MOL.add(30,40,50);
		
	}

}

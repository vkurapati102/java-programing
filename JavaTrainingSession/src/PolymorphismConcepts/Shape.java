package PolymorphismConcepts;

public abstract class Shape {

	private int number;
	
	public abstract void MultiplicationTable();
	
	public Shape(int number) {
	
		this.number= number;
		
		System.out.println("Multiplication Table for :"+ number);
	
	}
	
		
}

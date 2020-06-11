package PolymorphismConcepts;

public class Circle extends Shape {
	
	int radius;
	
	
	public Circle(String colour, int radius) {
		
		super(colour);
		System.out.println("Colour of the Circle is:" + colour);
		this.radius = radius;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle("yellow", 3);
		
		System.out.println("The area of the Circle is: " + c.Area());
	}

	@Override
	int Area() {
		// TODO Auto-generated method stub
		return 20*radius;
	}

}

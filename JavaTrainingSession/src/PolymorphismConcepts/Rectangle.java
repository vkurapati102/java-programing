package PolymorphismConcepts;

public class Rectangle extends Shape {

	int length;
	int width;
		
	public Rectangle(String colour, int length, int width) {
		super(colour);
		this.length = length;
		this.width = width;
		System.out.println("Colour of the Rectangle is : " + colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r = new Rectangle("Red",10,5);
System.out.println("Area of the Rectangle is:" + r.Area());
	}

	@Override
	int Area() {
		// TODO Auto-generated method stub
		return length * width;
	}

}

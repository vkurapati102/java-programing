package PolymorphismConcepts;

public class MasterClassAbstractDemo extends AbstractClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MasterClassAbstractDemo mcad = new MasterClassAbstractDemo();
		mcad.livingRoom();
		mcad.kitchenRoom();
		mcad.gardenArea();
		

	}

	@Override
	public void gardenArea() {
		// TODO Auto-generated method stub
	System.out.println("Garden");
	System.out.println("********");
	System.out.println("Tea Table & Chair");
	System.out.println("Garden Shed");
	System.out.println("Grass");
	System.out.println("Plants");
	}

}

package PolymorphismConcepts;

public class Table extends Shape{

	int i;
	
		public Table(int number) {
		super(number);
				
		this.i=number;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table t = new Table(7);
		t.MultiplicationTable();
	}

	@Override
	public void MultiplicationTable() {
		
		for (int j=1;j<=10;j++) {
			
			System.out.println(i+"*"+j+"="+i*j);
		}
		
		
	}

}

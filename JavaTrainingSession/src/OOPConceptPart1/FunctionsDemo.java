package OOPConceptPart1;

public class FunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsDemo  fd = new FunctionsDemo();
		
		fd.test();
		int p= fd.add();
		System.out.println(p);
		String x = fd.s();
		
		System.out.println(x);
		int d = fd.division(15,5);
		System.out.println(d);
		

	}
		
		public void test() {
			
			System.out.println("This test method is not returning anything");
		}
		
		public int add() {
			System.out.println("This is add method");
			
			int x= 10;
			int y = 20;
			int z = x+y;
			
			return z;
			
		}
		
		public String s() {
			
			System.out.println("This is String s Method");
			String t = "Selenium";
			
			return t;
			
		}
		
		public int division(int x , int y) {
			System.out.println("This is division method");
			
			int d = x/y;
			
			return d;
			
		}
	}



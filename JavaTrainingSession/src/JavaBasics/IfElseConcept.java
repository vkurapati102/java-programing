package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=530;
		int b= 650;
		int c= 775;
		
		if (a>b) {
			System.out.println("a is greatest");
		}
		else {
			System.out.println("b is greatest");
		}

	//Nested ifElse
		
		if(a==b) {
			System.out.println("a is equal to b");
		}
		
	else {
		System.out.println("a is not equal to b");
	}
	if(a>b & a>c) {
		
		System.out.println("a is the greatest");
	}
		
		else if(b>c){
			
			System.out.println("b is the greatest");
		}
			
			else {
				System.out.println("c is the greatest");
			}
	
		}
	
	
		

	
	}
	



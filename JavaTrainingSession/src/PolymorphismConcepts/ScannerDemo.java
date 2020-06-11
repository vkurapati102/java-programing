package PolymorphismConcepts;

import java.util.Scanner;

public class ScannerDemo {
	
	
	public void sem1() {
		
		System.out.println("Enter Sem1 Marks");
		System.out.println("****************");
		
		Scanner sem1 = new Scanner(System.in);
		System.out.println("Subject1:");
		int m1= sem1.nextInt();
		System.out.println("Subject2:");
		int m2=sem1.nextInt();
		System.out.println("Subject3:");
		int m3 = sem1.nextInt();
		
		int total = m1+m2+m3;
	System.out.println("Total marks in the Sem1 =" + m3);
		
	}
	
	/*public void sem2()
	{
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScannerDemo  sd = new ScannerDemo();
		sd.sem1();

	}

}

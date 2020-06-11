package PolymorphismConcepts;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		i=s.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		
	}
}

package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "100";
		
		int i= Integer.parseInt(s);
		System.out.println(i);
		
		String t= "12.33";
		
		double j = Double.parseDouble(t);
		
		System.out.println(j);
		
		int k = 20;
		
		String s1 = String.valueOf(k);
		System.out.println(s1+20);
		
		String s2 = "True";
		boolean b = Boolean.parseBoolean(s2);
		
		System.out.println(b);
				
		

	}

}

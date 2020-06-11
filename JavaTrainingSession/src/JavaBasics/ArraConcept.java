package JavaBasics;

public class ArraConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[4];
		i[0]= 10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
	System.out.println(i.length);
	for(int j=0;j<(i.length);j++) {
	System.out.println(i[j]);	
		}
	
	double d[] = new double[3];
	
	d[0] = 12.33;
	d[1] = 15.77;
	d[2] = 16.33;
	System.out.println(d[2]);
	
	char c[]= new char[2];
	
	c[0] = 'r';
	c[1] = 'k';
	System.out.println(c[1]);
	
	String s[]= new String[3];
	
	s[0] = "Rama";
	s[1] = "Raju";
	s[2] = "Kurapati";
	
	System.out.println(s.length);
	System.out.println(s[1]);
	
	Object ob[] = new Object[6];
	
	ob[0] = "Tom";
	ob[1] = 25;
	ob[2]= 12.33;
	ob[3] = "10/02/80";
	ob[4] = 'M';
	ob[5] = "London";
	
	System.out.println(ob[5]);
	System.out.println(ob.length);
	
	}
}

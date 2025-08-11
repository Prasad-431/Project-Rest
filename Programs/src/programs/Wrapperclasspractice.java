package programs;

public class Wrapperclasspractice {

	public static void main(String[] args) {
		String s1 = "113";
		String s2 = "87";
		
	System.out.println("***Before using wapperclass***");
	System.out.println(s1+s2);
	
	System.out.println("***After using wapperclass***");
	
	int valueofs1=Integer.parseInt(s1);
	int valueofs2=Integer.parseInt(s2);
	
	System.out.println(valueofs1+valueofs2);
	
	
	String s3="34.6";
	double valueofs3=Double.parseDouble(s3);
	
	int a=10;
	Integer b=a;
	
	
	}

}

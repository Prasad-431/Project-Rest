package programs;

public class Rotatedversionofstring {

	public static void main(String[] args) {
		String str1="Durgaprasadreddy";
		
		String str2="prasadreddyDurga";
		if(str1.length()!=str2.length()) {
			System.out.println("str2 is not rotation of str1");
		}
		else
		{
			
			String str3=str1+str1;
			if(str3.contains(str2))
				System.out.println("str2 is rotation of str1");
			else
				System.out.println("str2 is not rotation of str1");
			
			
		}
		
	
	
	}

}

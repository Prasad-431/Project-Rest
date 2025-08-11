package programs;

public class Replace_Special_Characters_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="&%&$$$$ a &#$# modified*)()&*^& String 9086657";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}

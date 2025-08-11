package programs;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="This is the String to reverse";
	//using for loop
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--) {
		
		rev=rev+s.charAt(i);
	}
System.out.println(rev);
	
//using String Buffer class
	
	StringBuffer sb= new StringBuffer(s);
	
	System.out.println(sb.reverse());
}}

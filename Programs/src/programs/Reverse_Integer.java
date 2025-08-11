package programs;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=1234;
 int rem,rev=0;
 
 while(num>0)
 {
	 rem=num%10;
	 rev=rev*10+rem;
	 num=num/10;
 }
 
 System.out.println(rev);
 
 
 //check palindrome
 int num1=12321;
 int rem1,rev1=0;
 int temp1=num1;
 while(num1>0)
 {
	 rem1=num1%10;
	 rev1=rev1*10+rem1;
	 num1=num1/10;
 }
 
 
 if(temp1==rev1)
	 System.out.println(temp1+ " Number is palindrome");
 else
	 System.out.println(temp1+" Number is not palindrome");
 
	}

}

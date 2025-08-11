package programs;

public class Fibonacci_Series {
	public static void main(String args[])
	{
		//next number is sum of its previous two numbers
		
		int num1=0,num2=1;
		int range=10;
		for(int i=0;i<10;i++)
		{
			System.out.println(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		
		
	}

}

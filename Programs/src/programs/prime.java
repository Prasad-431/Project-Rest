package programs;

import java.util.Scanner;

public class prime {
	public static void main(String args[])
	{
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				sum++;
		}
		if(sum==2)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}

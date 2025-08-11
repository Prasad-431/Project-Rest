package programs;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{	
			num=num/10;
			sum++;
		}
		System.out.println(sum);

	}

}

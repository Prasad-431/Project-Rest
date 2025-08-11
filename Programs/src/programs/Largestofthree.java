package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largestofthree {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System .in);
	
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		System.out.println("Enter third number: ");
		int num3=sc.nextInt();
		
		if((num1>num2)&&(num1>num3))
			System.out.println(num1+" is largest");
		else if((num2>num1)&&(num2>num3))
			System.out.println(num2+" is largest");
		else
			System.out.println(num3+" is largest");
		
		
		
		
		System.out.println("**************Using Collections *********************");
		
		
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		
		System.out.println(Collections.max(list)); 
	}

}

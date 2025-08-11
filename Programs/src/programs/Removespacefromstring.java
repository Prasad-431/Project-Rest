package programs;

import java.util.Scanner;

public class Removespacefromstring {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= sc.nextLine();
	String str1=	str.replaceAll("[\\s]", "");
	System.out.println(str1);
		
		
		
	}

}

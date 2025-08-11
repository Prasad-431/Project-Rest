package programs;

import java.util.Scanner;

public class Wordscount {
	
	public static void main(String args[]) {
		
		System.out.println("Enter String: ");
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		String[] arr= str.split(" ");
		System.out.println("No of words: "+ arr.length);
		
		int count=1;
// without using array
		
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ' )) {
				
				count ++;
			}
		}
		System.out.println("No of words: "+count);
		
	}

}

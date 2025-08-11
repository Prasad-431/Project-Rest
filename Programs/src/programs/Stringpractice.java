package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String1: ");
		String str1 = sc.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		String temp = str1;
		char[] arr = str1.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ' ') {
				list.add(i);
			}

		}
		int last=str1.length()-1;
		System.out.println(list);
		String rev="";
		String cpy=temp.replaceAll("\\s", "");
		
		for(int k=0;k<list.size();k++) {
			list.set(k,last-list.get(k));
		}
//		StringBuffer sb= new StringBuffer(cpy);
//		
//		sb=sb.reverse();
//		for(Integer k:list) {
//			sb.insert(k, " ");
//		}
//		
//		rev=sb.toString();
//		System.out.println(rev);
	
		
		for(int i=cpy.length()-1;i>=0;i--) {
			System.out.println("i="+i);
			if(list.contains(i))
				rev=rev+" ";
			rev=rev+cpy.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}
}
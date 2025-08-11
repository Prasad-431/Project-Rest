package programs;

import java.util.ArrayList;

public class Reverseofstringbykeepingspaces {

	public static void main(String[] args) {
		String s = "I Am Not String";

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				list.add(i);
			}
		}
System.out.println(list);
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			
				temp = temp + s.charAt(i);

			

		}
		
		for(int n:list) {
			
			temp=temp.replace(temp.charAt(n), ' ');
					
					
					
		}
		
		System.out.println(temp);
	}

}

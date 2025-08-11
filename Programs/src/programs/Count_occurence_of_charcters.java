package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_occurence_of_charcters {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		s=s.replaceAll("\\s", "");
		s=s.toLowerCase();
		char[] charr=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap();
		
		for(char c:charr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			
			}
			else
			{
				
				map.put(c, 1);
			}
			
		}
			
			for(Map.Entry<Character, Integer> data: map.entrySet()) {
				
				
				System.out.println(data.getKey()+" : "+data.getValue());
				
				
			}
			
			
		}

	}



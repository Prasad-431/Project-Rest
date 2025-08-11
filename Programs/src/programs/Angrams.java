package programs;

import java.util.HashMap;

public class Angrams {

	public static void main(String[] args) {
		String s1="School Master";
		String s2="The Classroom";
		
		String copys1=s1.replaceAll("\\s", "").toLowerCase();
		String copys2=s2.replaceAll("\\s", "").toLowerCase();
		boolean status=true;
		if(copys1.length()!=copys2.length()) {
			
			status=false;
		}
		else {
			
			
			HashMap<Character,Integer> map= new HashMap<Character,Integer>();
			
			for(int i=0;i<copys1.length();i++) {
				
				
				char charaskey=copys1.charAt(i);
				int charkeyvalue=0;
				if(map.containsKey(charaskey)) {
					charkeyvalue=map.get(charaskey);
				}
				map.put(charaskey, ++charkeyvalue);
				
				 charaskey=copys2.charAt(i);
				 charkeyvalue=0;
				if(map.containsKey(charaskey)) {
					charkeyvalue=map.get(charaskey);
				}
				map.put(charaskey, --charkeyvalue);
				
			}
			
			for(Integer in:map.values())
			{
				if(in!=0) 
				{
					status=false;
				}
			}
			
		}
		
		if(status==true)
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");


	}

}

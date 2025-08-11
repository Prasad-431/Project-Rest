package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> set1= new TreeSet();
		set1.add("Durga");
		set1.add("abc");
		set1.add("23");
		set1.add("prasad");
		
		System.out.println(set1);
		System.out.println("*********Using For Loop*********");
		for(String e:set1) {
			System.out.println(e);
		}
		System.out.println("*********Using For Iterator*********");
		Iterator itr=set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********After converting to list*********");
		ArrayList<String> conlist=new ArrayList<String>(set1);
		
		System.out.println(conlist);
		
		System.out.println(conlist.get(2));
		
	}

}

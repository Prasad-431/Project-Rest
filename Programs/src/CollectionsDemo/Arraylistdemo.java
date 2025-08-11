package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("Red");
		list.add("Orange");
		list.add("Green");
		
		list.add("Blue");
		System.out.println(list);
		System.out.println("******************");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		System.out.println("******************");
		list.set(0, "Black");
		System.out.println(list);
Collections.sort(list);
System.out.println(list);

list.trimToSize();

	
	}

}

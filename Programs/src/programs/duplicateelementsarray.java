package programs;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateelementsarray {
	 public static void main(String args[]) {
		 
		 int[] arr= {1,3,10,9,1,7,9};
		 
		 HashSet<Integer> set=new HashSet();
		 
		 for(int i=0;i<arr.length;i++) {
			 set.add(arr[i]);
			 
		 }
		 
		 ArrayList<Integer> list= new ArrayList<Integer>(set);
		 
		 System.out.println(list);
		 
	 }
	

}

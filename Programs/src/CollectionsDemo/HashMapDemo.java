package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> obj= new HashMap();
		obj.put("1", "Name");
		obj.put("2", "Role");
		obj.put("3", "Employer");
		obj.put("4", "Location");
		for(Map.Entry<String,String> data:obj.entrySet()){
			
			
			System.out.println("Key value: "+data.getKey()+" Entry Value: "+data.getValue());
		}

	}

}

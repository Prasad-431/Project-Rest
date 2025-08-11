package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicatevaluesofstring {

	public static void main(String[] args) {
		String str = "Bread butter and bread";

		
			String[] words = str.toLowerCase().split(" ");
			HashMap<String, Integer> wordscollection = new HashMap();
			for (String str1 : words) {

				if (wordscollection.containsKey(str1)) {

					wordscollection.put(str1, wordscollection.get(str1) + 1);

				} else {
					wordscollection.put(str1, 1);
				}
				

			}

			for (Map.Entry<String, Integer> data : wordscollection.entrySet()) {

				if (data.getValue() > 1) {
					System.out.println(data.getKey() + " count: " + data.getValue());

				}

			}

		}

	}



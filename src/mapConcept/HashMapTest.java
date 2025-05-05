package mapConcept;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> marksMap = new HashMap<String, Integer>();
		marksMap.put("Jpthi", 100);
		marksMap.put("Aparna", 60);
		marksMap.put("dev", 75);
		System.out.println(marksMap.size());
		marksMap.put("dev", 85);// dev marks will update, won't create new record
		System.out.println(marksMap.size());
		System.out.println(marksMap.get("dev"));
		System.out.println(marksMap.get("tom"));//null
		System.out.println(marksMap);//able to print directly.
		//won't save in the order
		//
		marksMap.put(null, 35);
		System.out.println(marksMap.get(null));
		marksMap.put(null, 15);
		
		System.out.println(marksMap.get(null));
		
		marksMap.put("Devia", null);
		System.out.println(marksMap.get("Devia"));
		
		//==========================================
		
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		numMap.put(100, 1);
		
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("ravi", "SDET1");
		
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		userMap.put("salary", 14.55);
		userMap.put("designation", "SDET");
		
		//
		
		
		
	}

}

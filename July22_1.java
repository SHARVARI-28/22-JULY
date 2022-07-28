
/*
Create a Collection called HashMap which is capable of storing String objects. 
The program should have the following abilities
a) Check if a particular key exists or not 
b) Check if a particular value exists or not 
c) Use Iterator to loop through the map key set
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class July22_1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Marigold", "Yellow");
		map.put("Hibiscus", "Red");
		map.put("Mogra", "White");
		
		
		// a) Check if a particular key exists or not 
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals("Rose")) {
				System.out.println("Key Rose exists");
				break;
			}
		}
		
		// b) Check if a particular value exists or not 
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("Pink")) {
				System.out.println("Value Pink exists");
				break;
			}
		}
		
		// c) Use Iterator to loop through the map key set
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
			System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
		}
	}
}

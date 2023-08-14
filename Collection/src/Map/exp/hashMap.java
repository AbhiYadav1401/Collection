
package Map.exp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(9, "Abhijeet");
		h.put(8,"rahul");
		h.put(7,"ram");
		h.put(6,"jeet");
		h.put(5,"kunal");
		System.out.println(h); // insertion order not prizered
		
		Set<Integer> s =h.keySet();
		System.out.println(s);
		
		Collection<String> s1 = h.values();
		System.out.println(s1);
		
		Set<Entry<Integer,String>> entry =h.entrySet();
		System.out.println(entry);
		
		for(Entry<Integer,String>e:entry)
		{
			System.out.println(e);
		}
		
	}

}

package cf.map.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) 
	{
		Map map = new HashMap();
		map.put(101, "Pranav");
		map.put(101, "Alok");
		map.put(102, "Kunal");
		map.put(103, "Kamal");
		map.put(null, null);
		System.out.println(map);
		
		map.put(null, "aaa");
		System.out.println(map);
		
		System.out.println(map.containsKey(103));
		System.out.println(map.containsValue("Kunal"));
		
		System.out.println(map.entrySet());
		
		map.remove(102);
		System.out.println(map);
		System.out.println(map.get(102));
		System.out.println(map.get(101));
		
		map.replace(103, "Ravi");
		System.out.println(map);
		
		System.out.println("Current size of Map = "+ map.size());
		System.out.println(map.isEmpty());
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println("Current size of Map = "+ map.size());
		
	}

}

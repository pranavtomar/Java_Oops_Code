package cf.map.demo;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
		tm.put(106, "pranav");
		tm.put(102, "kunal");
		tm.put(107, "kamal");
		tm.put(108, "rahul");
		tm.put(101, "ravi");
		
		System.out.println(tm);
		System.out.println("Ceiling Entry : " + tm.ceilingEntry(102));
		System.out.println("Ceiling Entry : " + tm.ceilingEntry(103));
		System.out.println("Ceiling Key : " + tm.ceilingKey(102));
		System.out.println("Contains Key : " + tm.containsKey(107));
		System.out.println("Contains Value : " + tm.containsValue("pranav"));
		System.out.println("First Entry : " + tm.firstEntry());
		System.out.println("Last Entry : " + tm.lastEntry());
		System.out.println("First Key : " + tm.firstKey());
		System.out.println("Floor Key : " + tm.floorKey(103));
		System.out.println("Floor entry : " + tm.floorEntry(104));
		System.out.println("All entries before key : " + tm.headMap(108));
		System.out.println("Higher entry compare to given key : " + tm.higherEntry(101));
		System.out.println("Higher key compare to key : " + tm.higherKey(108));
		
		System.out.println("Only key values in form of set : "+ tm.keySet());
		System.out.println("SubMap : "+ tm.subMap(102,108));
		System.out.println("Delete first entry: " + tm.pollFirstEntry());
		System.out.println(tm);
		System.out.println("Delete last entry: " + tm.pollLastEntry());
		System.out.println(tm);
		tm.clear();
		System.out.println("After removing element : " + tm);
		
		
	}

}

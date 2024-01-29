package cf.map.demo;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 HashMap<Integer, String> map = new HashMap<Integer, String>();           
	     map.put(100,"Amit");    
	     map.put(101,"Vijay");    
	     map.put(102,"Rahul");    
	     //Fetching key  
	     System.out.println("Keys: "+ map.keySet());  
	     //Fetching value  
	     System.out.println("Values: "+ map.values());  
	     //Fetching key-value pair  
	     System.out.println("Key-Value pairs: "+ map.entrySet()); 
	     
	}

}

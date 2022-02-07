package Map;

import java.util.HashMap;
import java.util.Map;

public class HashTable1 {

public static void main(String[] args) {
				
	HashMap<Integer, String> map=new HashMap<Integer, String>();
				
				map.put(1, "SQL");
				map.put(2, "JAVA");
				map.put(3, "DBMS");
				map.put(null, "RDBMS");
				map.put(4, null);
				map.put(null,null);
				map.put(5,null);


				
				System.out.println(map);
				System.out.println("get element "+map.get(5));
				map.remove(4);
				System.out.println(map);
				
				//iterate using for loop
				for(Map.Entry m :map.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
				
		}
}






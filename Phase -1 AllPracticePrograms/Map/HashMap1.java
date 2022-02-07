package Map;

import java.util.HashMap;
import java.util.Map;

	public class HashMap1 {

		public static void main(String[] args) {
			
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			
			map.put(5, "SQL");
			map.put(9, "JAVA");
			map.put(5, "DBMS");
			map.put(null, "RDBMS");
			map.put(8, null);
			map.put(null,null);
			map.put(6,null);


			
			System.out.println(map);
			System.out.println("get element "+map.get(5));
			map.remove(8);
			System.out.println(map);
			
			System.out.println(" ");
	        

			//iterate using for loop
			for(Map.Entry m :map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
		}
	}



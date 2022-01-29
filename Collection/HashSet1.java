package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("Madhuri");
		set.add("Manisha");
		set.add(null);
		set.add("Bhagyashree");
		set.add("Diksha");
		set.add("Jasmin");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("Seema"));
		
		set.remove(null);
		
		System.out.println(set);
		
		
		//iterate using for each Loop
		for(String s:set) {
        	
            System.out.println(s);

        }
		
		System.out.println(" ");
        
        //iterate using  iteration
        Iterator<String> itr =set.iterator();
		while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
		
	}
}


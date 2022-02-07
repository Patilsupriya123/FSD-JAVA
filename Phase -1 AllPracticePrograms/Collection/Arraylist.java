package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Before adding element: "+list.size());
		
		list.add("Apple");
		list.add("Mango");
		list.add(null);
		list.add("Papaya");
		list.add("Orange");
		
		System.out.println("After adding element: "+list.size());
		System.out.println(list);
		
		System.out.println(" Element at Index 4: "+list.get(4));
		list.add("Burger");
		System.out.println(list);
		
		System.out.println("List contains apple? " +list.contains("Papaya") );
		
		
		list.remove(3);
		System.out.println(list);
		
		list.add("Grapes");
		System.out.println(list);
		
		for(String s:list) {
        	
            System.out.println(s);

        }
        
		System.out.println(" ");
        

        
        //iterate using  iteration
        Iterator<String> itr =list.iterator();
		while(itr.hasNext())
        {
            System.out.println(itr.next());

        }

}

}

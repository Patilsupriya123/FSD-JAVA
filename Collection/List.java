package Collection;

import java.util.Iterator;
import java.util.LinkedList;
 
public class List {

	public static void main(String[] args)
    {
 
        LinkedList<Integer> list =new  LinkedList();
 
    
            list.add(10);
            list.add(40);
            list.add(30);
            list.add(70);
            list.add(90);
            
        System.out.println(list);
 
        list.remove(3);
        System.out.println(list);
        
        System.out.println("list contains 20? "+list.contains(20));
        list.add(80);
        System.out.println(list);
        
        //using for each loop
        for(Integer i:list) {
        	
            System.out.println(i);

        }
        
		System.out.println(" ");
        

        //iterate using  iteration
        Iterator<Integer> itr =list.iterator();
		while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
 
    }
}
package Collection;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Vector1{
	public static void main(String[] args)
    {
 
        Vector<Integer> list = new Vector<Integer>();
 
    
            list.add(100);
            list.add(400);
            list.add(300);
            list.add(700);
            list.add(900);
            
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



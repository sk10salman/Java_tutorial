package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//sort using compare

class Comp implements Comparator<Integer>{
	public int compare(Integer x,Integer y)
	{
		if(x==y)
			return 0;
		if(x<y)
			return 1;
		return -1;
	}
}


public class Array_List{

	 public static void main(String[] args) {

	        ArrayList<Integer> aList = new ArrayList<Integer>();

	        //using add
	        aList.add(20);
	        aList.add(24);
	        aList.add(4);
	        aList.add(8);
	        aList.add(12);
	        aList.add(16);
	       
	        System.out.println("The ArrayList:" + aList);

	        // Using set() Method at index 2 value 333
	        aList.set(2,333);
	        System.out.println("The ArrayList after setting 333 value at index 2:" + aList);
	        
	        // size = 6
	        int n=aList.size();
	        
	        System.out.println("The ArrayList size:" + n);
	        
	        
	        //  making object array from alist using toArray();
	        Object [] object= aList.toArray();
	        
	        for(int i=0;i<object.length;i++)
	        	System.out.println("at indext: "+i+" value is: "+object[i]);
	        
	        // check aList is empty using isEmpty()
	        
	        if(aList.isEmpty())
	        	System.out.println("empty");
	        else 
	        	System.out.println("not empty");
	        	
	        // remove value/object from aList using remove(object);
	        
	        aList.remove(2); //remove at index 2
	        
	        //get value at indext 0
	        System.out.println("The ArrayList:" + aList.get(0));
	        
	        
	        // arrayList in array size of 5 ArrayList[5]
	      /*  ArrayList<Integer>[] al = new ArrayList[5];
	        
	        // initializing
	        for (int i = 0; i < n; i++) {
	            al[i] = new ArrayList<Integer>();
	        }
	        
	       */
	       
	        // Iterator
	        
	        Iterator itr=aList.iterator();
	        System.out.print("values from Iterator ");
	        while(itr.hasNext())
	        {
	        	System.out.print(itr.next()+" ");
	        }
	        
	        
	        // contains elements
	        
	        if(aList.contains(12))
	        	System.out.println("contains");
	        
	        
	        // sort ArrayList
	        Collections.sort(aList);
	        
	        System.out.println("The sorted ArrayList:" + aList);
	        
        Collections.sort(aList,new Comp());
	        
	        System.out.println("The Descending sorted ArrayList:" + aList);
	     

	    }


}

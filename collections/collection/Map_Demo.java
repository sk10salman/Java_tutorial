package collection;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		Map<String, Integer> mp= new HashMap<String, Integer>();
		mp.put("salman",1);
		mp.put("rahul", 2);
		mp.put("naresh", 3);
		Scanner sc = new Scanner(System.in);
		String check=sc.next();
		if(mp.containsKey(check))
			System.out.println(mp.get(check));
		else
			System.out.println("not in the list");
	}

}

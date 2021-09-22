package collection.map;

import java.util.*;
import java.util.Map.Entry;

public class character_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		Map<Character, Integer>mp=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
				mp.put(c, 1);
				
		}
		for(char c : mp.keySet())
		{
			System.out.println(c + " : "+ mp.get(c));
		}
		
		for(Entry<Character, Integer> c: mp.entrySet())
		{
			System.out.println(c.getKey()+" : "+ c.getValue());
			
		}
		
		

	}

}

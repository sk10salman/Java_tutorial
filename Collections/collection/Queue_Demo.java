package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q= new LinkedList<Integer>();
		for(int i=1;i<6;i++)
			q.add(i);
		 System.out.println("Elements of queue " + q);
		
		System.out.println(q.peek());
	}

}

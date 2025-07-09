package arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class UnderQueues 
{

	public static void main(String[] args)
	{
//---------------Queue---------------------//
		System.out.println("<----Queue---->");
		
		Queue<String> names = new LinkedList<>();
		names.offer("Gsit");
		names.add("hello");
		names.add("mohan");
		names.peek();		// Inspects (looks at) the head [returns the element at the head of the queue]
		names.poll();  		 // will remove the head of the queue.
		
		System.out.println(names);		//  o/p: [hello, mohan]			
		
//---------------DeQueue---------------------//	
		
		System.out.println("\n<----Deque---->");
		Deque<String> dq = new LinkedList<>();
		
		dq.add("sandesh");
		dq.addFirst("Anagha");
		dq.addLast("Shailaja");
		dq.add(null);
		
	//	dq.peekFirst();     //returns the element from the head
		
		dq.removeFirst();	 //remove the First added element [Anagha]
		dq.removeLast();     //remove the last added element	[null]
		
		System.out.println(dq);

	}

}

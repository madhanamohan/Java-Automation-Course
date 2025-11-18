package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ListExamples 
{

	public static void main(String[] args) 
	{
		
/* 1].		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(20);
		list.addFirst(10);
		list.addLast(30);
		
	//	Iterator<Integer>ite=list.iterator();  // Forward only
		
		ListIterator<Integer>listite=list.listIterator();	// Forward + Backward
		while(listite.hasNext())
		{
			System.out.println(listite.next());
		}
		System.out.println("\n");
		while(listite.hasPrevious())
		{
			System.out.println(listite.previous());
		}	*/
		
//	=======================================	 List common methods ======================================= //	
		
		Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));
	//	System.out.println(ls.add(null));
		ls.add(1, 11);
		System.out.println(ls.get(1));
		System.out.println(ls.set(1, 99));	// Retrieve(Replace) the elements at index
		System.out.println(ls.remove(10));
		System.out.println(ls.size());
		System.out.println(ls.contains(5));
		System.out.println(ls.isEmpty());
	//	ls.clear();
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.print(ls.get(i)+ " ");
		}
			
	}

}

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Listconcept {
	
	public void listconceptimplementation()
	{
		//ArrayList<Integer> al = new ArrayList();
		LinkedList<Integer> al = new LinkedList();
		LinkedList<Integer> al1 = new LinkedList();
		//ArrayList<Integer> al1 = new ArrayList();
		System.out.println(al);
		al.add(5);
		al.add(1);
		al.add(2);
		al.add(7);
		System.out.println(al.size());
		al1 = (LinkedList<Integer>) al.clone();
		al.set(2, 5);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al1);
		for(int c : al1)
		{
			if(c==1)
			{
			System.out.println(c);
			}
		}
		
		Iterator it = al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(al1.contains(1));
		System.out.println(al1.get(0));
		System.out.println(al1.isEmpty());
		System.out.println(al.isEmpty());
		System.out.println(al1.indexOf(5));
		al1.set(3, 5);
		System.out.println(al1.lastIndexOf(5));
		Collections.sort(al1);
		System.out.println(al1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listconcept L = new Listconcept();
		L.listconceptimplementation();
	}

}

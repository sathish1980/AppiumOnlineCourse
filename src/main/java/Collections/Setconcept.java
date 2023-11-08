package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Setconcept {

	public void setconceptimplementation()
	{
		//HashSet<Integer> al = new HashSet();
		//HashSet<Integer> al1 = new HashSet();
		//LinkedHashSet<Integer> al = new LinkedHashSet();
		//LinkedHashSet<Integer> al1 = new LinkedHashSet();
		TreeSet<Integer> al = new TreeSet();
		TreeSet<Integer> al1 = new TreeSet();
		//ArrayList<Integer> al1 = new ArrayList();
		System.out.println(al);
		al.add(5);
		al.add(1);
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(-1);
		System.out.println(al.size());
		al1 = (TreeSet<Integer>) al.clone();
		//al.set(2, 5);
		System.out.println(al);
		al.remove(7); // remove based on value
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
		//System.out.println(al1.get(0));
		System.out.println(al1.isEmpty());
		System.out.println(al.isEmpty());
		//System.out.println(al1.indexOf(5));
		//al1.set(3, 5);
		//System.out.println(al1.lastIndexOf(5));
		//Collections.sort(al1);
		System.out.println(al1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setconcept s = new Setconcept();
		s.setconceptimplementation();
	}

}
